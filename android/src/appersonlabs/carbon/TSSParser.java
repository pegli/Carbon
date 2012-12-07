// $ANTLR 3.4 /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g 2012-12-07 09:54:01

package appersonlabs.carbon;

import ti.modules.titanium.ui.UIModule;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TSSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "CharEsc", "Comment", "DQChar", "EXPR", "EscapeSeq", "Exp", "FALSE", "FIELD", "Float", "HexDigit", "HexEsc", "IdPart", "Identifier", "Integer", "LT", "NULL", "NUMBER", "OBJECT", "Predicate", "SELECTOR", "SQChar", "STRING", "STYLE", "Sign", "String", "StyleName", "TRUE", "TiConst", "TiUIFill", "TiUISize", "UnicodeEsc", "WPATH", "Whitespace", "','", "':'", "'['", "']'", "'false'", "'null'", "'true'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int ARRAY=4;
    public static final int CharEsc=5;
    public static final int Comment=6;
    public static final int DQChar=7;
    public static final int EXPR=8;
    public static final int EscapeSeq=9;
    public static final int Exp=10;
    public static final int FALSE=11;
    public static final int FIELD=12;
    public static final int Float=13;
    public static final int HexDigit=14;
    public static final int HexEsc=15;
    public static final int IdPart=16;
    public static final int Identifier=17;
    public static final int Integer=18;
    public static final int LT=19;
    public static final int NULL=20;
    public static final int NUMBER=21;
    public static final int OBJECT=22;
    public static final int Predicate=23;
    public static final int SELECTOR=24;
    public static final int SQChar=25;
    public static final int STRING=26;
    public static final int STYLE=27;
    public static final int Sign=28;
    public static final int String=29;
    public static final int StyleName=30;
    public static final int TRUE=31;
    public static final int TiConst=32;
    public static final int TiUIFill=33;
    public static final int TiUISize=34;
    public static final int UnicodeEsc=35;
    public static final int WPATH=36;
    public static final int Whitespace=37;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TSSParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TSSParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TSSParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g"; }



    private Number decodeConstant(String name) {
      return new Long(0);
    }



    public static class stylesheet_return extends ParserRuleReturnScope {
        public List<Map<String,Map<String,Object>>> styles;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stylesheet"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:142:1: stylesheet returns [List<Map<String,Map<String,Object>>> styles] : style[$styles] ( ',' style[$styles] )* ;
    public final TSSParser.stylesheet_return stylesheet() throws RecognitionException {
        TSSParser.stylesheet_return retval = new TSSParser.stylesheet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        TSSParser.style_return style1 =null;

        TSSParser.style_return style3 =null;


        Object char_literal2_tree=null;


        		retval.styles = new ArrayList<Map<String,Map<String,Object>>>();
        	
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:146:2: ( style[$styles] ( ',' style[$styles] )* )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:146:4: style[$styles] ( ',' style[$styles] )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_style_in_stylesheet769);
            style1=style(retval.styles);

            state._fsp--;

            adaptor.addChild(root_0, style1.getTree());

            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:146:19: ( ',' style[$styles] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:146:21: ',' style[$styles]
            	    {
            	    char_literal2=(Token)match(input,38,FOLLOW_38_in_stylesheet774); 
            	    char_literal2_tree = 
            	    (Object)adaptor.create(char_literal2)
            	    ;
            	    adaptor.addChild(root_0, char_literal2_tree);


            	    pushFollow(FOLLOW_style_in_stylesheet776);
            	    style3=style(retval.styles);

            	    state._fsp--;

            	    adaptor.addChild(root_0, style3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stylesheet"


    public static class style_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "style"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:149:1: style[List list] : selector ':' object ;
    public final TSSParser.style_return style(List list) throws RecognitionException {
        TSSParser.style_return retval = new TSSParser.style_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal5=null;
        TSSParser.selector_return selector4 =null;

        TSSParser.object_return object6 =null;


        Object char_literal5_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:150:2: ( selector ':' object )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:150:4: selector ':' object
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_selector_in_style792);
            selector4=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector4.getTree());

            char_literal5=(Token)match(input,39,FOLLOW_39_in_style794); 
            char_literal5_tree = 
            (Object)adaptor.create(char_literal5)
            ;
            adaptor.addChild(root_0, char_literal5_tree);


            pushFollow(FOLLOW_object_in_style796);
            object6=object();

            state._fsp--;

            adaptor.addChild(root_0, object6.getTree());


            		Map<String,Map<String,Object>> style = new HashMap<String,Map<String,Object>>(1);
            		style.put((selector4!=null?selector4.sel:null), (object6!=null?object6.obj:null));
            		list.add(style);
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "style"


    public static class selector_return extends ParserRuleReturnScope {
        public String sel;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selector"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:158:1: selector returns [String sel] : ( StyleName | Identifier | string );
    public final TSSParser.selector_return selector() throws RecognitionException {
        TSSParser.selector_return retval = new TSSParser.selector_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token StyleName7=null;
        Token Identifier8=null;
        TSSParser.string_return string9 =null;


        Object StyleName7_tree=null;
        Object Identifier8_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:159:2: ( StyleName | Identifier | string )
            int alt2=3;
            switch ( input.LA(1) ) {
            case StyleName:
                {
                alt2=1;
                }
                break;
            case Identifier:
                {
                alt2=2;
                }
                break;
            case String:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:159:4: StyleName
                    {
                    root_0 = (Object)adaptor.nil();


                    StyleName7=(Token)match(input,StyleName,FOLLOW_StyleName_in_selector814); 
                    StyleName7_tree = 
                    (Object)adaptor.create(StyleName7)
                    ;
                    adaptor.addChild(root_0, StyleName7_tree);


                     retval.sel = (StyleName7!=null?StyleName7.getText():null); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:160:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector822); 
                    Identifier8_tree = 
                    (Object)adaptor.create(Identifier8)
                    ;
                    adaptor.addChild(root_0, Identifier8_tree);


                     retval.sel = (Identifier8!=null?Identifier8.getText():null); 

                    }
                    break;
                case 3 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:161:4: string
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_string_in_selector830);
                    string9=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string9.getTree());

                     retval.sel = (string9!=null?string9.str:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selector"


    public static class object_return extends ParserRuleReturnScope {
        public Map<String,Object> obj;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "object"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:166:1: object returns [Map<String,Object> obj] : ( '{' '}' | '{' members[$obj] '}' );
    public final TSSParser.object_return object() throws RecognitionException {
        TSSParser.object_return retval = new TSSParser.object_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal11=null;
        Token char_literal12=null;
        Token char_literal14=null;
        TSSParser.members_return members13 =null;


        Object char_literal10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;
        Object char_literal14_tree=null;


        		retval.obj = new HashMap<String,Object>();
        	
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:170:2: ( '{' '}' | '{' members[$obj] '}' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==46) ) {
                    alt3=1;
                }
                else if ( (LA3_1==Identifier||LA3_1==String) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:170:4: '{' '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal10=(Token)match(input,45,FOLLOW_45_in_object857); 
                    char_literal10_tree = 
                    (Object)adaptor.create(char_literal10)
                    ;
                    adaptor.addChild(root_0, char_literal10_tree);


                    char_literal11=(Token)match(input,46,FOLLOW_46_in_object859); 
                    char_literal11_tree = 
                    (Object)adaptor.create(char_literal11)
                    ;
                    adaptor.addChild(root_0, char_literal11_tree);


                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:171:5: '{' members[$obj] '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal12=(Token)match(input,45,FOLLOW_45_in_object865); 
                    char_literal12_tree = 
                    (Object)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);


                    pushFollow(FOLLOW_members_in_object867);
                    members13=members(retval.obj);

                    state._fsp--;

                    adaptor.addChild(root_0, members13.getTree());

                    char_literal14=(Token)match(input,46,FOLLOW_46_in_object870); 
                    char_literal14_tree = 
                    (Object)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "object"


    public static class members_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "members"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:174:1: members[Map<String,Object> obj] : pair[obj] ( ',' pair[obj] )* ;
    public final TSSParser.members_return members(Map<String,Object> obj) throws RecognitionException {
        TSSParser.members_return retval = new TSSParser.members_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal16=null;
        TSSParser.pair_return pair15 =null;

        TSSParser.pair_return pair17 =null;


        Object char_literal16_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:175:2: ( pair[obj] ( ',' pair[obj] )* )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:175:4: pair[obj] ( ',' pair[obj] )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pair_in_members882);
            pair15=pair(obj);

            state._fsp--;

            adaptor.addChild(root_0, pair15.getTree());

            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:175:14: ( ',' pair[obj] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==38) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:175:16: ',' pair[obj]
            	    {
            	    char_literal16=(Token)match(input,38,FOLLOW_38_in_members887); 
            	    char_literal16_tree = 
            	    (Object)adaptor.create(char_literal16)
            	    ;
            	    adaptor.addChild(root_0, char_literal16_tree);


            	    pushFollow(FOLLOW_pair_in_members889);
            	    pair17=pair(obj);

            	    state._fsp--;

            	    adaptor.addChild(root_0, pair17.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "members"


    public static class key_return extends ParserRuleReturnScope {
        public String text;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:178:1: key returns [String text] : ( String | Identifier );
    public final TSSParser.key_return key() throws RecognitionException {
        TSSParser.key_return retval = new TSSParser.key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token String18=null;
        Token Identifier19=null;

        Object String18_tree=null;
        Object Identifier19_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:179:2: ( String | Identifier )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==String) ) {
                alt5=1;
            }
            else if ( (LA5_0==Identifier) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:179:4: String
                    {
                    root_0 = (Object)adaptor.nil();


                    String18=(Token)match(input,String,FOLLOW_String_in_key907); 
                    String18_tree = 
                    (Object)adaptor.create(String18)
                    ;
                    adaptor.addChild(root_0, String18_tree);


                     retval.text = (String18!=null?String18.getText():null); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:180:5: Identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_key916); 
                    Identifier19_tree = 
                    (Object)adaptor.create(Identifier19)
                    ;
                    adaptor.addChild(root_0, Identifier19_tree);


                     retval.text = (Identifier19!=null?Identifier19.getText():null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key"


    public static class pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pair"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:183:1: pair[Map<String,Object> obj] : key ':' value ;
    public final TSSParser.pair_return pair(Map<String,Object> obj) throws RecognitionException {
        TSSParser.pair_return retval = new TSSParser.pair_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal21=null;
        TSSParser.key_return key20 =null;

        TSSParser.value_return value22 =null;


        Object char_literal21_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:184:2: ( key ':' value )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:184:4: key ':' value
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_key_in_pair930);
            key20=key();

            state._fsp--;

            adaptor.addChild(root_0, key20.getTree());

            char_literal21=(Token)match(input,39,FOLLOW_39_in_pair932); 
            char_literal21_tree = 
            (Object)adaptor.create(char_literal21)
            ;
            adaptor.addChild(root_0, char_literal21_tree);


            pushFollow(FOLLOW_value_in_pair934);
            value22=value();

            state._fsp--;

            adaptor.addChild(root_0, value22.getTree());

             obj.put((key20!=null?key20.text:null), (value22!=null?value22.val:null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pair"


    public static class array_return extends ParserRuleReturnScope {
        public List arr;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:187:1: array returns [List arr] : ( '[' ']' | '[' elements ']' );
    public final TSSParser.array_return array() throws RecognitionException {
        TSSParser.array_return retval = new TSSParser.array_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        TSSParser.elements_return elements26 =null;


        Object char_literal23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal27_tree=null;


        		retval.arr = new ArrayList();
        	
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:191:2: ( '[' ']' | '[' elements ']' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==41) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EXPR||LA6_1==Float||LA6_1==Integer||LA6_1==String||(LA6_1 >= TiConst && LA6_1 <= TiUISize)||LA6_1==WPATH||LA6_1==40||(LA6_1 >= 42 && LA6_1 <= 45)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:191:4: '[' ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal23=(Token)match(input,40,FOLLOW_40_in_array958); 
                    char_literal23_tree = 
                    (Object)adaptor.create(char_literal23)
                    ;
                    adaptor.addChild(root_0, char_literal23_tree);


                    char_literal24=(Token)match(input,41,FOLLOW_41_in_array960); 
                    char_literal24_tree = 
                    (Object)adaptor.create(char_literal24)
                    ;
                    adaptor.addChild(root_0, char_literal24_tree);


                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:192:4: '[' elements ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal25=(Token)match(input,40,FOLLOW_40_in_array965); 
                    char_literal25_tree = 
                    (Object)adaptor.create(char_literal25)
                    ;
                    adaptor.addChild(root_0, char_literal25_tree);


                    pushFollow(FOLLOW_elements_in_array967);
                    elements26=elements();

                    state._fsp--;

                    adaptor.addChild(root_0, elements26.getTree());

                    char_literal27=(Token)match(input,41,FOLLOW_41_in_array969); 
                    char_literal27_tree = 
                    (Object)adaptor.create(char_literal27)
                    ;
                    adaptor.addChild(root_0, char_literal27_tree);


                     retval.arr.addAll((elements26!=null?elements26.ele:null)); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class elements_return extends ParserRuleReturnScope {
        public List ele;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elements"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:195:1: elements returns [List ele] :v+= value ( ',' v+= value )* ;
    public final TSSParser.elements_return elements() throws RecognitionException {
        TSSParser.elements_return retval = new TSSParser.elements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal28=null;
        List list_v=null;
        RuleReturnScope v = null;
        Object char_literal28_tree=null;


        		retval.ele = new ArrayList();
        	
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:199:2: (v+= value ( ',' v+= value )* )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:199:4: v+= value ( ',' v+= value )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_value_in_elements994);
            v=value();

            state._fsp--;

            adaptor.addChild(root_0, v.getTree());
            if (list_v==null) list_v=new ArrayList();
            list_v.add(v.getTree());


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:199:13: ( ',' v+= value )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==38) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:199:14: ',' v+= value
            	    {
            	    char_literal28=(Token)match(input,38,FOLLOW_38_in_elements997); 
            	    char_literal28_tree = 
            	    (Object)adaptor.create(char_literal28)
            	    ;
            	    adaptor.addChild(root_0, char_literal28_tree);


            	    pushFollow(FOLLOW_value_in_elements1001);
            	    v=value();

            	    state._fsp--;

            	    adaptor.addChild(root_0, v.getTree());
            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v.getTree());


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


             retval.ele.addAll(list_v); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elements"


    public static class ticonst_return extends ParserRuleReturnScope {
        public Object tic;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ticonst"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:202:1: ticonst returns [Object tic] : ( TiConst | TiUISize | TiUIFill );
    public final TSSParser.ticonst_return ticonst() throws RecognitionException {
        TSSParser.ticonst_return retval = new TSSParser.ticonst_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TiConst29=null;
        Token TiUISize30=null;
        Token TiUIFill31=null;

        Object TiConst29_tree=null;
        Object TiUISize30_tree=null;
        Object TiUIFill31_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:203:2: ( TiConst | TiUISize | TiUIFill )
            int alt8=3;
            switch ( input.LA(1) ) {
            case TiConst:
                {
                alt8=1;
                }
                break;
            case TiUISize:
                {
                alt8=2;
                }
                break;
            case TiUIFill:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:203:4: TiConst
                    {
                    root_0 = (Object)adaptor.nil();


                    TiConst29=(Token)match(input,TiConst,FOLLOW_TiConst_in_ticonst1020); 
                    TiConst29_tree = 
                    (Object)adaptor.create(TiConst29)
                    ;
                    adaptor.addChild(root_0, TiConst29_tree);


                     retval.tic = decodeConstant((TiConst29!=null?TiConst29.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:204:4: TiUISize
                    {
                    root_0 = (Object)adaptor.nil();


                    TiUISize30=(Token)match(input,TiUISize,FOLLOW_TiUISize_in_ticonst1028); 
                    TiUISize30_tree = 
                    (Object)adaptor.create(TiUISize30)
                    ;
                    adaptor.addChild(root_0, TiUISize30_tree);


                     retval.tic = UIModule.SIZE; 

                    }
                    break;
                case 3 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:205:4: TiUIFill
                    {
                    root_0 = (Object)adaptor.nil();


                    TiUIFill31=(Token)match(input,TiUIFill,FOLLOW_TiUIFill_in_ticonst1035); 
                    TiUIFill31_tree = 
                    (Object)adaptor.create(TiUIFill31)
                    ;
                    adaptor.addChild(root_0, TiUIFill31_tree);


                     retval.tic = UIModule.FILL; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ticonst"


    public static class string_return extends ParserRuleReturnScope {
        public String str;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:208:1: string returns [String str] : String ;
    public final TSSParser.string_return string() throws RecognitionException {
        TSSParser.string_return retval = new TSSParser.string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token String32=null;

        Object String32_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:209:2: ( String )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:209:4: String
            {
            root_0 = (Object)adaptor.nil();


            String32=(Token)match(input,String,FOLLOW_String_in_string1052); 
            String32_tree = 
            (Object)adaptor.create(String32)
            ;
            adaptor.addChild(root_0, String32_tree);



            		String s = (String32!=null?String32.getText():null);
            		retval.str = s.substring(1, s.length() - 1);
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string"


    public static class number_return extends ParserRuleReturnScope {
        public Number num;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:216:1: number returns [Number num] : ( Integer | Float );
    public final TSSParser.number_return number() throws RecognitionException {
        TSSParser.number_return retval = new TSSParser.number_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Integer33=null;
        Token Float34=null;

        Object Integer33_tree=null;
        Object Float34_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:217:2: ( Integer | Float )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Integer) ) {
                alt9=1;
            }
            else if ( (LA9_0==Float) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:217:4: Integer
                    {
                    root_0 = (Object)adaptor.nil();


                    Integer33=(Token)match(input,Integer,FOLLOW_Integer_in_number1070); 
                    Integer33_tree = 
                    (Object)adaptor.create(Integer33)
                    ;
                    adaptor.addChild(root_0, Integer33_tree);


                     retval.num = new Long((Integer33!=null?Integer33.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:218:4: Float
                    {
                    root_0 = (Object)adaptor.nil();


                    Float34=(Token)match(input,Float,FOLLOW_Float_in_number1078); 
                    Float34_tree = 
                    (Object)adaptor.create(Float34)
                    ;
                    adaptor.addChild(root_0, Float34_tree);


                     retval.num = new Double((Float34!=null?Float34.getText():null)); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"


    public static class value_return extends ParserRuleReturnScope {
        public Object val;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:221:1: value returns [Object val] : ( 'null' | 'true' | 'false' | number | string | array | object | ticonst | WPATH | EXPR );
    public final TSSParser.value_return value() throws RecognitionException {
        TSSParser.value_return retval = new TSSParser.value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal35=null;
        Token string_literal36=null;
        Token string_literal37=null;
        Token WPATH43=null;
        Token EXPR44=null;
        TSSParser.number_return number38 =null;

        TSSParser.string_return string39 =null;

        TSSParser.array_return array40 =null;

        TSSParser.object_return object41 =null;

        TSSParser.ticonst_return ticonst42 =null;


        Object string_literal35_tree=null;
        Object string_literal36_tree=null;
        Object string_literal37_tree=null;
        Object WPATH43_tree=null;
        Object EXPR44_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:222:2: ( 'null' | 'true' | 'false' | number | string | array | object | ticonst | WPATH | EXPR )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt10=1;
                }
                break;
            case 44:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case Float:
            case Integer:
                {
                alt10=4;
                }
                break;
            case String:
                {
                alt10=5;
                }
                break;
            case 40:
                {
                alt10=6;
                }
                break;
            case 45:
                {
                alt10=7;
                }
                break;
            case TiConst:
            case TiUIFill:
            case TiUISize:
                {
                alt10=8;
                }
                break;
            case WPATH:
                {
                alt10=9;
                }
                break;
            case EXPR:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:222:5: 'null'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal35=(Token)match(input,43,FOLLOW_43_in_value1097); 
                    string_literal35_tree = 
                    (Object)adaptor.create(string_literal35)
                    ;
                    adaptor.addChild(root_0, string_literal35_tree);


                     retval.val = null; 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:223:5: 'true'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal36=(Token)match(input,44,FOLLOW_44_in_value1106); 
                    string_literal36_tree = 
                    (Object)adaptor.create(string_literal36)
                    ;
                    adaptor.addChild(root_0, string_literal36_tree);


                     retval.val = Boolean.TRUE; 

                    }
                    break;
                case 3 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:224:5: 'false'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal37=(Token)match(input,42,FOLLOW_42_in_value1115); 
                    string_literal37_tree = 
                    (Object)adaptor.create(string_literal37)
                    ;
                    adaptor.addChild(root_0, string_literal37_tree);


                     retval.val = Boolean.FALSE; 

                    }
                    break;
                case 4 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:225:4: number
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_number_in_value1123);
                    number38=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number38.getTree());

                     retval.val = (number38!=null?number38.num:null); 

                    }
                    break;
                case 5 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:226:4: string
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_string_in_value1131);
                    string39=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string39.getTree());

                     retval.val = (string39!=null?string39.str:null); 

                    }
                    break;
                case 6 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:227:4: array
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_array_in_value1139);
                    array40=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array40.getTree());

                     retval.val = (array40!=null?array40.arr:null); 

                    }
                    break;
                case 7 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:228:4: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_value1147);
                    object41=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object41.getTree());

                     retval.val = (object41!=null?object41.obj:null); 

                    }
                    break;
                case 8 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:229:4: ticonst
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ticonst_in_value1155);
                    ticonst42=ticonst();

                    state._fsp--;

                    adaptor.addChild(root_0, ticonst42.getTree());

                     retval.val = (ticonst42!=null?ticonst42.tic:null); 

                    }
                    break;
                case 9 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:230:4: WPATH
                    {
                    root_0 = (Object)adaptor.nil();


                    WPATH43=(Token)match(input,WPATH,FOLLOW_WPATH_in_value1163); 
                    WPATH43_tree = 
                    (Object)adaptor.create(WPATH43)
                    ;
                    adaptor.addChild(root_0, WPATH43_tree);


                     retval.val = null; 

                    }
                    break;
                case 10 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:231:4: EXPR
                    {
                    root_0 = (Object)adaptor.nil();


                    EXPR44=(Token)match(input,EXPR,FOLLOW_EXPR_in_value1171); 
                    EXPR44_tree = 
                    (Object)adaptor.create(EXPR44)
                    ;
                    adaptor.addChild(root_0, EXPR44_tree);


                     retval.val = null; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_style_in_stylesheet769 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_stylesheet774 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_style_in_stylesheet776 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_selector_in_style792 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_style794 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_object_in_style796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StyleName_in_selector814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_selector822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_selector830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_object857 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_object859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_object865 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_members_in_object867 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_object870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_in_members882 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_members887 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_pair_in_members889 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_String_in_key907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_key916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair930 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_pair932 = new BitSet(new long[]{0x00003D1720042100L});
    public static final BitSet FOLLOW_value_in_pair934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_array958 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_array960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_array965 = new BitSet(new long[]{0x00003D1720042100L});
    public static final BitSet FOLLOW_elements_in_array967 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_array969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_elements994 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_elements997 = new BitSet(new long[]{0x00003D1720042100L});
    public static final BitSet FOLLOW_value_in_elements1001 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_TiConst_in_ticonst1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TiUISize_in_ticonst1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TiUIFill_in_ticonst1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_string1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_number1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Float_in_number1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_value1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_value1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_value1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ticonst_in_value1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WPATH_in_value1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_in_value1171 = new BitSet(new long[]{0x0000000000000002L});

}