grammar TSS;

options {
output = AST;
}

tokens {
TRUE; FALSE; NULL;
STRING;
NUMBER;
OBJECT;
ARRAY;
FIELD;
STYLE;
SELECTOR;
}

@header {
package appersonlabs.carbon;

import ti.modules.titanium.ui.UIModule;
import java.util.Map;
import java.util.HashMap;
}

@lexer::header {
package appersonlabs.carbon;
}

@members {

private Number decodeConstant(String name) {
  return new Long(0);
}

}

Sign	:	'+' | '-'
	;

Exp	: 	('e' | 'E') ('+' | '-')? '0'..'9'+
	;

Float	:	Integer '.' '0'..'9'+ Exp?
	;

Integer	:	'0' | ( Sign? '1'..'9' '0'..'9'* )
	;



fragment
HexDigit: 	('a'..'f' | 'A'..'F' | '0'..'9')
	;

fragment
UnicodeEsc
	: 	'u' HexDigit HexDigit HexDigit HexDigit
	;

fragment
CharEsc
	: 	'"' | '\'' | 'b' | 'f' | 'n' | 'r' | 't'
	;

fragment
HexEsc	:	'x' HexDigit HexDigit
	;

fragment
EscapeSeq
	:	CharEsc
	| 	UnicodeEsc
	|	HexEsc
	;

fragment
DQChar	:	~('"' | '\\' | LT )
	|	'\\' EscapeSeq
	;

fragment
SQChar	:	~('\'' | '\\' | LT )
	|	'\\' EscapeSeq
	;

String	:	'"' DQChar* '"'
	|	'\'' SQChar* '\''
	;


TiUISize
	:	'Ti' ('tanium')? '.UI.SIZE'
	;

TiUIFill
	:	'Ti' ('tanium')? '.UI.FILL'
	;

TiConst	: 	'Ti' ('tanium')? '.' Identifier
	;


fragment
IdPart	: 	( 'a'..'z' | 'A'..'Z' | '_' ) ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' )*
	;

Identifier
	: 	IdPart ( '.' IdPart)*
	;

StyleName
	:	( '#' | '.' )? Identifier Predicate?
	;

fragment
Predicate
	:	'[' IdPart '=' IdPart ( ',' IdPart '=' IdPart )* ']'
	;

WPATH	: 	'WPATH(' ( options { greedy = false; } : . )* ')'	{ System.err.println("[WARNING] WPATH() not supported"); }
	;

EXPR	: 	'expr(' ( options { greedy = false; } : . )* ')'	{ System.err.println("[WARNING] expr() not supported"); }
	;

BlockComment	: 	'/*' ( options { greedy = false; } : . )* '*/'
		{ skip(); }
	;

LineComment  :   '//' ( options { greedy = false; } : . )* LT
    { skip(); }
  ;

fragment
LT	:	'\n' | '\r'
	;

Whitespace
	:	( ' ' | LT | '\t' )+		{ skip(); }
	;



stylesheet returns [List<Map<String,Map<String,Object>>> styles]
	@init {
		$styles = new ArrayList<Map<String,Map<String,Object>>>();
	}
	:	style[$styles] ( ',' style[$styles] )*
	;

style[List list]
	:	selector ':' object
	{
		Map<String,Map<String,Object>> style = new HashMap<String,Map<String,Object>>(1);
		style.put($selector.sel, $object.obj);
		$list.add(style);
	}
	;

selector returns [String sel]
	:	StyleName		{ $sel = $StyleName.text; }
	|	Identifier		{ $sel = $Identifier.text; }
	|	string			{ $sel = $string.str; }
	;

// style value types

object returns [Map<String,Object> obj]
	@init {
		$obj = new HashMap<String,Object>();
	}
	:	'{' '}'
	| 	'{' members[$obj] '}'
	;

members[Map<String,Object> obj]
	:	pair[obj] ( ',' pair[obj])* ','?
	;

key returns [String text]
	:	String		{ $text = $String.text; }
	| 	Identifier	{ $text = $Identifier.text; }
	;

pair[Map<String,Object> obj]
	:	key ':' value 	{ $obj.put($key.text, $value.val); }
	;

array returns [List arr]
	@init {
		$arr = new ArrayList();
	}
	:	'[' ']'
	|	'[' elements ']'	{ $arr.addAll($elements.ele); }
	;

elements returns [List ele]
	@init {
		$ele = new ArrayList();
	}
	:	v+=value (',' v+=value)*	{ $ele.addAll($v); }
	;

ticonst returns [Object tic]
	:	TiConst		{ $tic = decodeConstant($TiConst.text); }
	|	TiUISize	{ $tic = UIModule.SIZE; }
	|	TiUIFill	{ $tic = UIModule.FILL; }
	;

string returns [String str]
	:	String
	{
		String s = $String.text;
		$str = s.substring(1, s.length() - 1);
	}
	;

number returns [Number num]
	:	Integer		{ $num = new Long($Integer.text); }
	|	Float		{ $num = new Double($Float.text); }
	;

value returns [Object val]
	: 	'null'		{ $val = null; }
	| 	'true'		{ $val = Boolean.TRUE; }
	| 	'false'		{ $val = Boolean.FALSE; }
	|	number		{ $val = $number.num; }
	|	string		{ $val = $string.str; }
	|	array		{ $val = $array.arr; }
	|	object		{ $val = $object.obj; }
	|	ticonst		{ $val = $ticonst.tic; }
	|	WPATH		{ $val = null; }
	|	EXPR		{ $val = null; }
	;
