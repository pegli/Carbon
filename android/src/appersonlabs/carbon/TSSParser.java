// $ANTLR 3.4 /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g 2012-12-07 10:51:10

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BlockComment", "CharEsc", "DQChar", "EXPR", "EscapeSeq", "Exp", "FALSE", "FIELD", "Float", "HexDigit", "HexEsc", "IdPart", "Identifier", "Integer", "LT", "LineComment", "NULL", "NUMBER", "OBJECT", "Predicate", "SELECTOR", "SQChar", "STRING", "STYLE", "Sign", "String", "StyleName", "TRUE", "TiConst", "TiUIFill", "TiUISize", "UnicodeEsc", "WPATH", "Whitespace", "','", "':'", "'['", "']'", "'false'", "'null'", "'true'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int ARRAY=4;
    public static final int BlockComment=5;
    public static final int CharEsc=6;
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
    public static final int LineComment=20;
    public static final int NULL=21;
    public static final int NUMBER=22;
    public static final int OBJECT=23;
    public static final int Predicate=24;
    public static final int SELECTOR=25;
    public static final int SQChar=26;
    public static final int STRING=27;
    public static final int STYLE=28;
    public static final int Sign=29;
    public static final int String=30;
    public static final int StyleName=31;
    public static final int TRUE=32;
    public static final int TiConst=33;
    public static final int TiUIFill=34;
    public static final int TiUISize=35;
    public static final int UnicodeEsc=36;
    public static final int WPATH=37;
    public static final int Whitespace=38;

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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:145:1: stylesheet returns [List<Map<String,Map<String,Object>>> styles] : style[$styles] ( ',' style[$styles] )* ;
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
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:149:2: ( style[$styles] ( ',' style[$styles] )* )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:149:4: style[$styles] ( ',' style[$styles] )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_style_in_stylesheet783);
            style1=style(retval.styles);

            state._fsp--;

            adaptor.addChild(root_0, style1.getTree());

            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:149:19: ( ',' style[$styles] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:149:21: ',' style[$styles]
            	    {
            	    char_literal2=(Token)match(input,39,FOLLOW_39_in_stylesheet788); 
            	    char_literal2_tree = 
            	    (Object)adaptor.create(char_literal2)
            	    ;
            	    adaptor.addChild(root_0, char_literal2_tree);


            	    pushFollow(FOLLOW_style_in_stylesheet790);
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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:152:1: style[List list] : selector ':' object ;
    public final TSSParser.style_return style(List list) throws RecognitionException {
        TSSParser.style_return retval = new TSSParser.style_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal5=null;
        TSSParser.selector_return selector4 =null;

        TSSParser.object_return object6 =null;


        Object char_literal5_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:153:2: ( selector ':' object )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:153:4: selector ':' object
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_selector_in_style806);
            selector4=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector4.getTree());

            char_literal5=(Token)match(input,40,FOLLOW_40_in_style808); 
            char_literal5_tree = 
            (Object)adaptor.create(char_literal5)
            ;
            adaptor.addChild(root_0, char_literal5_tree);


            pushFollow(FOLLOW_object_in_style810);
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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:161:1: selector returns [String sel] : ( StyleName | Identifier | string );
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
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:162:2: ( StyleName | Identifier | string )
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
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:162:4: StyleName
                    {
                    root_0 = (Object)adaptor.nil();


                    StyleName7=(Token)match(input,StyleName,FOLLOW_StyleName_in_selector828); 
                    StyleName7_tree = 
                    (Object)adaptor.create(StyleName7)
                    ;
                    adaptor.addChild(root_0, StyleName7_tree);


                     retval.sel = (StyleName7!=null?StyleName7.getText():null); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:163:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector836); 
                    Identifier8_tree = 
                    (Object)adaptor.create(Identifier8)
                    ;
                    adaptor.addChild(root_0, Identifier8_tree);


                     retval.sel = (Identifier8!=null?Identifier8.getText():null); 

                    }
                    break;
                case 3 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:164:4: string
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_string_in_selector844);
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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:169:1: object returns [Map<String,Object> obj] : ( '{' '}' | '{' members[$obj] '}' );
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
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:173:2: ( '{' '}' | '{' members[$obj] '}' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==46) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==47) ) {
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
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:173:4: '{' '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal10=(Token)match(input,46,FOLLOW_46_in_object871); 
                    char_literal10_tree = 
                    (Object)adaptor.create(char_literal10)
                    ;
                    adaptor.addChild(root_0, char_literal10_tree);


                    char_literal11=(Token)match(input,47,FOLLOW_47_in_object873); 
                    char_literal11_tree = 
                    (Object)adaptor.create(char_literal11)
                    ;
                    adaptor.addChild(root_0, char_literal11_tree);


                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:174:5: '{' members[$obj] '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal12=(Token)match(input,46,FOLLOW_46_in_object879); 
                    char_literal12_tree = 
                    (Object)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);


                    pushFollow(FOLLOW_members_in_object881);
                    members13=members(retval.obj);

                    state._fsp--;

                    adaptor.addChild(root_0, members13.getTree());

                    char_literal14=(Token)match(input,47,FOLLOW_47_in_object884); 
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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:177:1: members[Map<String,Object> obj] : pair[obj] ( ',' pair[obj] )* ( ',' )? ;
    public final TSSParser.members_return members(Map<String,Object> obj) throws RecognitionException {
        TSSParser.members_return retval = new TSSParser.members_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal16=null;
        Token char_literal18=null;
        TSSParser.pair_return pair15 =null;

        TSSParser.pair_return pair17 =null;


        Object char_literal16_tree=null;
        Object char_literal18_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:178:2: ( pair[obj] ( ',' pair[obj] )* ( ',' )? )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:178:4: pair[obj] ( ',' pair[obj] )* ( ',' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pair_in_members896);
            pair15=pair(obj);

            state._fsp--;

            adaptor.addChild(root_0, pair15.getTree());

            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:178:14: ( ',' pair[obj] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==Identifier||LA4_1==String) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:178:16: ',' pair[obj]
            	    {
            	    char_literal16=(Token)match(input,39,FOLLOW_39_in_members901); 
            	    char_literal16_tree = 
            	    (Object)adaptor.create(char_literal16)
            	    ;
            	    adaptor.addChild(root_0, char_literal16_tree);


            	    pushFollow(FOLLOW_pair_in_members903);
            	    pair17=pair(obj);

            	    state._fsp--;

            	    adaptor.addChild(root_0, pair17.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:178:32: ( ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:178:32: ','
                    {
                    char_literal18=(Token)match(input,39,FOLLOW_39_in_members908); 
                    char_literal18_tree = 
                    (Object)adaptor.create(char_literal18)
                    ;
                    adaptor.addChild(root_0, char_literal18_tree);


                    }
                    break;

            }


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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:181:1: key returns [String text] : ( String | Identifier );
    public final TSSParser.key_return key() throws RecognitionException {
        TSSParser.key_return retval = new TSSParser.key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token String19=null;
        Token Identifier20=null;

        Object String19_tree=null;
        Object Identifier20_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:182:2: ( String | Identifier )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==String) ) {
                alt6=1;
            }
            else if ( (LA6_0==Identifier) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:182:4: String
                    {
                    root_0 = (Object)adaptor.nil();


                    String19=(Token)match(input,String,FOLLOW_String_in_key924); 
                    String19_tree = 
                    (Object)adaptor.create(String19)
                    ;
                    adaptor.addChild(root_0, String19_tree);


                     retval.text = (String19!=null?String19.getText():null); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:183:5: Identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_key933); 
                    Identifier20_tree = 
                    (Object)adaptor.create(Identifier20)
                    ;
                    adaptor.addChild(root_0, Identifier20_tree);


                     retval.text = (Identifier20!=null?Identifier20.getText():null); 

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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:186:1: pair[Map<String,Object> obj] : key ':' value ;
    public final TSSParser.pair_return pair(Map<String,Object> obj) throws RecognitionException {
        TSSParser.pair_return retval = new TSSParser.pair_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal22=null;
        TSSParser.key_return key21 =null;

        TSSParser.value_return value23 =null;


        Object char_literal22_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:187:2: ( key ':' value )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:187:4: key ':' value
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_key_in_pair947);
            key21=key();

            state._fsp--;

            adaptor.addChild(root_0, key21.getTree());

            char_literal22=(Token)match(input,40,FOLLOW_40_in_pair949); 
            char_literal22_tree = 
            (Object)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);


            pushFollow(FOLLOW_value_in_pair951);
            value23=value();

            state._fsp--;

            adaptor.addChild(root_0, value23.getTree());

             obj.put((key21!=null?key21.text:null), (value23!=null?value23.val:null)); 

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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:190:1: array returns [List arr] : ( '[' ']' | '[' elements ']' );
    public final TSSParser.array_return array() throws RecognitionException {
        TSSParser.array_return retval = new TSSParser.array_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        TSSParser.elements_return elements27 =null;


        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;


        		retval.arr = new ArrayList();
        	
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:194:2: ( '[' ']' | '[' elements ']' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==42) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EXPR||LA7_1==Float||LA7_1==Integer||LA7_1==String||(LA7_1 >= TiConst && LA7_1 <= TiUISize)||LA7_1==WPATH||LA7_1==41||(LA7_1 >= 43 && LA7_1 <= 46)) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:194:4: '[' ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal24=(Token)match(input,41,FOLLOW_41_in_array975); 
                    char_literal24_tree = 
                    (Object)adaptor.create(char_literal24)
                    ;
                    adaptor.addChild(root_0, char_literal24_tree);


                    char_literal25=(Token)match(input,42,FOLLOW_42_in_array977); 
                    char_literal25_tree = 
                    (Object)adaptor.create(char_literal25)
                    ;
                    adaptor.addChild(root_0, char_literal25_tree);


                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:195:4: '[' elements ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal26=(Token)match(input,41,FOLLOW_41_in_array982); 
                    char_literal26_tree = 
                    (Object)adaptor.create(char_literal26)
                    ;
                    adaptor.addChild(root_0, char_literal26_tree);


                    pushFollow(FOLLOW_elements_in_array984);
                    elements27=elements();

                    state._fsp--;

                    adaptor.addChild(root_0, elements27.getTree());

                    char_literal28=(Token)match(input,42,FOLLOW_42_in_array986); 
                    char_literal28_tree = 
                    (Object)adaptor.create(char_literal28)
                    ;
                    adaptor.addChild(root_0, char_literal28_tree);


                     retval.arr.addAll((elements27!=null?elements27.ele:null)); 

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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:198:1: elements returns [List ele] :v+= value ( ',' v+= value )* ;
    public final TSSParser.elements_return elements() throws RecognitionException {
        TSSParser.elements_return retval = new TSSParser.elements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal29=null;
        List list_v=null;
        RuleReturnScope v = null;
        Object char_literal29_tree=null;


        		retval.ele = new ArrayList();
        	
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:202:2: (v+= value ( ',' v+= value )* )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:202:4: v+= value ( ',' v+= value )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_value_in_elements1011);
            v=value();

            state._fsp--;

            adaptor.addChild(root_0, v.getTree());
            if (list_v==null) list_v=new ArrayList();
            list_v.add(v.getTree());


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:202:13: ( ',' v+= value )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:202:14: ',' v+= value
            	    {
            	    char_literal29=(Token)match(input,39,FOLLOW_39_in_elements1014); 
            	    char_literal29_tree = 
            	    (Object)adaptor.create(char_literal29)
            	    ;
            	    adaptor.addChild(root_0, char_literal29_tree);


            	    pushFollow(FOLLOW_value_in_elements1018);
            	    v=value();

            	    state._fsp--;

            	    adaptor.addChild(root_0, v.getTree());
            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v.getTree());


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:205:1: ticonst returns [Object tic] : ( TiConst | TiUISize | TiUIFill );
    public final TSSParser.ticonst_return ticonst() throws RecognitionException {
        TSSParser.ticonst_return retval = new TSSParser.ticonst_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TiConst30=null;
        Token TiUISize31=null;
        Token TiUIFill32=null;

        Object TiConst30_tree=null;
        Object TiUISize31_tree=null;
        Object TiUIFill32_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:206:2: ( TiConst | TiUISize | TiUIFill )
            int alt9=3;
            switch ( input.LA(1) ) {
            case TiConst:
                {
                alt9=1;
                }
                break;
            case TiUISize:
                {
                alt9=2;
                }
                break;
            case TiUIFill:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:206:4: TiConst
                    {
                    root_0 = (Object)adaptor.nil();


                    TiConst30=(Token)match(input,TiConst,FOLLOW_TiConst_in_ticonst1037); 
                    TiConst30_tree = 
                    (Object)adaptor.create(TiConst30)
                    ;
                    adaptor.addChild(root_0, TiConst30_tree);


                     retval.tic = decodeConstant((TiConst30!=null?TiConst30.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:207:4: TiUISize
                    {
                    root_0 = (Object)adaptor.nil();


                    TiUISize31=(Token)match(input,TiUISize,FOLLOW_TiUISize_in_ticonst1045); 
                    TiUISize31_tree = 
                    (Object)adaptor.create(TiUISize31)
                    ;
                    adaptor.addChild(root_0, TiUISize31_tree);


                     retval.tic = UIModule.SIZE; 

                    }
                    break;
                case 3 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:208:4: TiUIFill
                    {
                    root_0 = (Object)adaptor.nil();


                    TiUIFill32=(Token)match(input,TiUIFill,FOLLOW_TiUIFill_in_ticonst1052); 
                    TiUIFill32_tree = 
                    (Object)adaptor.create(TiUIFill32)
                    ;
                    adaptor.addChild(root_0, TiUIFill32_tree);


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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:211:1: string returns [String str] : String ;
    public final TSSParser.string_return string() throws RecognitionException {
        TSSParser.string_return retval = new TSSParser.string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token String33=null;

        Object String33_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:212:2: ( String )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:212:4: String
            {
            root_0 = (Object)adaptor.nil();


            String33=(Token)match(input,String,FOLLOW_String_in_string1069); 
            String33_tree = 
            (Object)adaptor.create(String33)
            ;
            adaptor.addChild(root_0, String33_tree);



            		String s = (String33!=null?String33.getText():null);
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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:219:1: number returns [Number num] : ( Integer | Float );
    public final TSSParser.number_return number() throws RecognitionException {
        TSSParser.number_return retval = new TSSParser.number_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Integer34=null;
        Token Float35=null;

        Object Integer34_tree=null;
        Object Float35_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:220:2: ( Integer | Float )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Integer) ) {
                alt10=1;
            }
            else if ( (LA10_0==Float) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:220:4: Integer
                    {
                    root_0 = (Object)adaptor.nil();


                    Integer34=(Token)match(input,Integer,FOLLOW_Integer_in_number1087); 
                    Integer34_tree = 
                    (Object)adaptor.create(Integer34)
                    ;
                    adaptor.addChild(root_0, Integer34_tree);


                     retval.num = new Long((Integer34!=null?Integer34.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:221:4: Float
                    {
                    root_0 = (Object)adaptor.nil();


                    Float35=(Token)match(input,Float,FOLLOW_Float_in_number1095); 
                    Float35_tree = 
                    (Object)adaptor.create(Float35)
                    ;
                    adaptor.addChild(root_0, Float35_tree);


                     retval.num = new Double((Float35!=null?Float35.getText():null)); 

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
    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:224:1: value returns [Object val] : ( 'null' | 'true' | 'false' | number | string | array | object | ticonst | WPATH | EXPR );
    public final TSSParser.value_return value() throws RecognitionException {
        TSSParser.value_return retval = new TSSParser.value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal36=null;
        Token string_literal37=null;
        Token string_literal38=null;
        Token WPATH44=null;
        Token EXPR45=null;
        TSSParser.number_return number39 =null;

        TSSParser.string_return string40 =null;

        TSSParser.array_return array41 =null;

        TSSParser.object_return object42 =null;

        TSSParser.ticonst_return ticonst43 =null;


        Object string_literal36_tree=null;
        Object string_literal37_tree=null;
        Object string_literal38_tree=null;
        Object WPATH44_tree=null;
        Object EXPR45_tree=null;

        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:225:2: ( 'null' | 'true' | 'false' | number | string | array | object | ticonst | WPATH | EXPR )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt11=1;
                }
                break;
            case 45:
                {
                alt11=2;
                }
                break;
            case 43:
                {
                alt11=3;
                }
                break;
            case Float:
            case Integer:
                {
                alt11=4;
                }
                break;
            case String:
                {
                alt11=5;
                }
                break;
            case 41:
                {
                alt11=6;
                }
                break;
            case 46:
                {
                alt11=7;
                }
                break;
            case TiConst:
            case TiUIFill:
            case TiUISize:
                {
                alt11=8;
                }
                break;
            case WPATH:
                {
                alt11=9;
                }
                break;
            case EXPR:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:225:5: 'null'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal36=(Token)match(input,44,FOLLOW_44_in_value1114); 
                    string_literal36_tree = 
                    (Object)adaptor.create(string_literal36)
                    ;
                    adaptor.addChild(root_0, string_literal36_tree);


                     retval.val = null; 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:226:5: 'true'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal37=(Token)match(input,45,FOLLOW_45_in_value1123); 
                    string_literal37_tree = 
                    (Object)adaptor.create(string_literal37)
                    ;
                    adaptor.addChild(root_0, string_literal37_tree);


                     retval.val = Boolean.TRUE; 

                    }
                    break;
                case 3 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:227:5: 'false'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal38=(Token)match(input,43,FOLLOW_43_in_value1132); 
                    string_literal38_tree = 
                    (Object)adaptor.create(string_literal38)
                    ;
                    adaptor.addChild(root_0, string_literal38_tree);


                     retval.val = Boolean.FALSE; 

                    }
                    break;
                case 4 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:228:4: number
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_number_in_value1140);
                    number39=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number39.getTree());

                     retval.val = (number39!=null?number39.num:null); 

                    }
                    break;
                case 5 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:229:4: string
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_string_in_value1148);
                    string40=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string40.getTree());

                     retval.val = (string40!=null?string40.str:null); 

                    }
                    break;
                case 6 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:230:4: array
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_array_in_value1156);
                    array41=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array41.getTree());

                     retval.val = (array41!=null?array41.arr:null); 

                    }
                    break;
                case 7 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:231:4: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_value1164);
                    object42=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object42.getTree());

                     retval.val = (object42!=null?object42.obj:null); 

                    }
                    break;
                case 8 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:232:4: ticonst
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ticonst_in_value1172);
                    ticonst43=ticonst();

                    state._fsp--;

                    adaptor.addChild(root_0, ticonst43.getTree());

                     retval.val = (ticonst43!=null?ticonst43.tic:null); 

                    }
                    break;
                case 9 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:233:4: WPATH
                    {
                    root_0 = (Object)adaptor.nil();


                    WPATH44=(Token)match(input,WPATH,FOLLOW_WPATH_in_value1180); 
                    WPATH44_tree = 
                    (Object)adaptor.create(WPATH44)
                    ;
                    adaptor.addChild(root_0, WPATH44_tree);


                     retval.val = null; 

                    }
                    break;
                case 10 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:234:4: EXPR
                    {
                    root_0 = (Object)adaptor.nil();


                    EXPR45=(Token)match(input,EXPR,FOLLOW_EXPR_in_value1188); 
                    EXPR45_tree = 
                    (Object)adaptor.create(EXPR45)
                    ;
                    adaptor.addChild(root_0, EXPR45_tree);


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


 

    public static final BitSet FOLLOW_style_in_stylesheet783 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_stylesheet788 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_style_in_stylesheet790 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_selector_in_style806 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_style808 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_object_in_style810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StyleName_in_selector828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_selector836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_selector844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_object871 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_object873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_object879 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_members_in_object881 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_object884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_in_members896 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_members901 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_pair_in_members903 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_members908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_key924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_key933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair947 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_pair949 = new BitSet(new long[]{0x00007A2E40042100L});
    public static final BitSet FOLLOW_value_in_pair951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_array975 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_array977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_array982 = new BitSet(new long[]{0x00007A2E40042100L});
    public static final BitSet FOLLOW_elements_in_array984 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_array986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_elements1011 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_elements1014 = new BitSet(new long[]{0x00007A2E40042100L});
    public static final BitSet FOLLOW_value_in_elements1018 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TiConst_in_ticonst1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TiUISize_in_ticonst1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TiUIFill_in_ticonst1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_string1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_number1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Float_in_number1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_value1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_value1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_value1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ticonst_in_value1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WPATH_in_value1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_in_value1188 = new BitSet(new long[]{0x0000000000000002L});

}