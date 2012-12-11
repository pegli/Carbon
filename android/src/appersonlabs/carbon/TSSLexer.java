// $ANTLR 3.4 /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g 2012-12-07 10:51:11

package appersonlabs.carbon;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TSSLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TSSLexer() {} 
    public TSSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TSSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:6:7: ( ',' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:7:7: ( ':' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:7:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:8:7: ( '[' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:8:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:9:7: ( ']' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:9:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:10:7: ( 'false' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:10:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:11:7: ( 'null' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:11:9: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:12:7: ( 'true' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:12:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:13:7: ( '{' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:14:7: ( '}' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "Sign"
    public final void mSign() throws RecognitionException {
        try {
            int _type = Sign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:38:6: ( '+' | '-' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Sign"

    // $ANTLR start "Exp"
    public final void mExp() throws RecognitionException {
        try {
            int _type = Exp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:41:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:41:8: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:41:20: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:41:33: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exp"

    // $ANTLR start "Float"
    public final void mFloat() throws RecognitionException {
        try {
            int _type = Float;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:44:7: ( Integer '.' ( '0' .. '9' )+ ( Exp )? )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:44:9: Integer '.' ( '0' .. '9' )+ ( Exp )?
            {
            mInteger(); 


            match('.'); 

            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:44:21: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:44:31: ( Exp )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:44:31: Exp
                    {
                    mExp(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Float"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:47:9: ( '0' | ( ( Sign )? '1' .. '9' ( '0' .. '9' )* ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                alt7=1;
            }
            else if ( (LA7_0=='+'||LA7_0=='-'||(LA7_0 >= '1' && LA7_0 <= '9')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:47:11: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:47:17: ( ( Sign )? '1' .. '9' ( '0' .. '9' )* )
                    {
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:47:17: ( ( Sign )? '1' .. '9' ( '0' .. '9' )* )
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:47:19: ( Sign )? '1' .. '9' ( '0' .. '9' )*
                    {
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:47:19: ( Sign )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    matchRange('1','9'); 

                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:47:34: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:54:9: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' ) )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "UnicodeEsc"
    public final void mUnicodeEsc() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:59:2: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:59:5: 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('u'); 

            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnicodeEsc"

    // $ANTLR start "CharEsc"
    public final void mCharEsc() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:64:2: ( '\"' | '\\'' | 'b' | 'f' | 'n' | 'r' | 't' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharEsc"

    // $ANTLR start "HexEsc"
    public final void mHexEsc() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:68:8: ( 'x' HexDigit HexDigit )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:68:10: 'x' HexDigit HexDigit
            {
            match('x'); 

            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexEsc"

    // $ANTLR start "EscapeSeq"
    public final void mEscapeSeq() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:73:2: ( CharEsc | UnicodeEsc | HexEsc )
            int alt8=3;
            switch ( input.LA(1) ) {
            case '\"':
            case '\'':
            case 'b':
            case 'f':
            case 'n':
            case 'r':
            case 't':
                {
                alt8=1;
                }
                break;
            case 'u':
                {
                alt8=2;
                }
                break;
            case 'x':
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
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:73:4: CharEsc
                    {
                    mCharEsc(); 


                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:74:5: UnicodeEsc
                    {
                    mUnicodeEsc(); 


                    }
                    break;
                case 3 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:75:4: HexEsc
                    {
                    mHexEsc(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSeq"

    // $ANTLR start "DQChar"
    public final void mDQChar() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:79:8: (~ ( '\"' | '\\\\' | LT ) | '\\\\' EscapeSeq )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='\\') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:79:10: ~ ( '\"' | '\\\\' | LT )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:80:4: '\\\\' EscapeSeq
                    {
                    match('\\'); 

                    mEscapeSeq(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DQChar"

    // $ANTLR start "SQChar"
    public final void mSQChar() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:84:8: (~ ( '\\'' | '\\\\' | LT ) | '\\\\' EscapeSeq )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='\\') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:84:10: ~ ( '\\'' | '\\\\' | LT )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:85:4: '\\\\' EscapeSeq
                    {
                    match('\\'); 

                    mEscapeSeq(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQChar"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:87:8: ( '\"' ( DQChar )* '\"' | '\\'' ( SQChar )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:87:10: '\"' ( DQChar )* '\"'
                    {
                    match('\"'); 

                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:87:14: ( DQChar )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:87:14: DQChar
                    	    {
                    	    mDQChar(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:88:4: '\\'' ( SQChar )* '\\''
                    {
                    match('\''); 

                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:88:9: ( SQChar )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '&')||(LA12_0 >= '(' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:88:9: SQChar
                    	    {
                    	    mSQChar(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "TiUISize"
    public final void mTiUISize() throws RecognitionException {
        try {
            int _type = TiUISize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:93:2: ( 'Ti' ( 'tanium' )? '.UI.SIZE' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:93:4: 'Ti' ( 'tanium' )? '.UI.SIZE'
            {
            match("Ti"); 



            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:93:9: ( 'tanium' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='t') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:93:10: 'tanium'
                    {
                    match("tanium"); 



                    }
                    break;

            }


            match(".UI.SIZE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TiUISize"

    // $ANTLR start "TiUIFill"
    public final void mTiUIFill() throws RecognitionException {
        try {
            int _type = TiUIFill;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:97:2: ( 'Ti' ( 'tanium' )? '.UI.FILL' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:97:4: 'Ti' ( 'tanium' )? '.UI.FILL'
            {
            match("Ti"); 



            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:97:9: ( 'tanium' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='t') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:97:10: 'tanium'
                    {
                    match("tanium"); 



                    }
                    break;

            }


            match(".UI.FILL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TiUIFill"

    // $ANTLR start "TiConst"
    public final void mTiConst() throws RecognitionException {
        try {
            int _type = TiConst;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:100:9: ( 'Ti' ( 'tanium' )? '.' Identifier )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:100:12: 'Ti' ( 'tanium' )? '.' Identifier
            {
            match("Ti"); 



            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:100:17: ( 'tanium' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='t') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:100:18: 'tanium'
                    {
                    match("tanium"); 



                    }
                    break;

            }


            match('.'); 

            mIdentifier(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TiConst"

    // $ANTLR start "IdPart"
    public final void mIdPart() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:106:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:106:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:106:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')||(LA17_0 >= 'A' && LA17_0 <= 'Z')||LA17_0=='_'||(LA17_0 >= 'a' && LA17_0 <= 'z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IdPart"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:109:2: ( IdPart ( '.' IdPart )* )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:109:5: IdPart ( '.' IdPart )*
            {
            mIdPart(); 


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:109:12: ( '.' IdPart )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='.') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:109:14: '.' IdPart
            	    {
            	    match('.'); 

            	    mIdPart(); 


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "StyleName"
    public final void mStyleName() throws RecognitionException {
        try {
            int _type = StyleName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:113:2: ( ( '#' | '.' )? Identifier ( Predicate )? )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:113:4: ( '#' | '.' )? Identifier ( Predicate )?
            {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:113:4: ( '#' | '.' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='#'||LA19_0=='.') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
                    {
                    if ( input.LA(1)=='#'||input.LA(1)=='.' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mIdentifier(); 


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:113:30: ( Predicate )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='[') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:113:30: Predicate
                    {
                    mPredicate(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StyleName"

    // $ANTLR start "Predicate"
    public final void mPredicate() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:119:2: ( '[' IdPart '=' IdPart ( ',' IdPart '=' IdPart )* ']' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:119:4: '[' IdPart '=' IdPart ( ',' IdPart '=' IdPart )* ']'
            {
            match('['); 

            mIdPart(); 


            match('='); 

            mIdPart(); 


            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:119:26: ( ',' IdPart '=' IdPart )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==',') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:119:28: ',' IdPart '=' IdPart
            	    {
            	    match(','); 

            	    mIdPart(); 


            	    match('='); 

            	    mIdPart(); 


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(']'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Predicate"

    // $ANTLR start "WPATH"
    public final void mWPATH() throws RecognitionException {
        try {
            int _type = WPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:121:7: ( 'WPATH(' ( options {greedy=false; } : . )* ')' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:121:10: 'WPATH(' ( options {greedy=false; } : . )* ')'
            {
            match("WPATH("); 



            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:121:19: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==')') ) {
                    alt22=2;
                }
                else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '(')||(LA22_0 >= '*' && LA22_0 <= '\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:121:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            match(')'); 

             System.err.println("[WARNING] WPATH() not supported"); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WPATH"

    // $ANTLR start "EXPR"
    public final void mEXPR() throws RecognitionException {
        try {
            int _type = EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:124:6: ( 'expr(' ( options {greedy=false; } : . )* ')' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:124:9: 'expr(' ( options {greedy=false; } : . )* ')'
            {
            match("expr("); 



            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:124:17: ( options {greedy=false; } : . )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==')') ) {
                    alt23=2;
                }
                else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '(')||(LA23_0 >= '*' && LA23_0 <= '\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:124:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            match(')'); 

             System.err.println("[WARNING] expr() not supported"); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPR"

    // $ANTLR start "BlockComment"
    public final void mBlockComment() throws RecognitionException {
        try {
            int _type = BlockComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:127:14: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:127:17: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:127:22: ( options {greedy=false; } : . )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='*') ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1=='/') ) {
                        alt24=2;
                    }
                    else if ( ((LA24_1 >= '\u0000' && LA24_1 <= '.')||(LA24_1 >= '0' && LA24_1 <= '\uFFFF')) ) {
                        alt24=1;
                    }


                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= ')')||(LA24_0 >= '+' && LA24_0 <= '\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:127:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            match("*/"); 



             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BlockComment"

    // $ANTLR start "LineComment"
    public final void mLineComment() throws RecognitionException {
        try {
            int _type = LineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:131:14: ( '//' ( options {greedy=false; } : . )* LT )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:131:18: '//' ( options {greedy=false; } : . )* LT
            {
            match("//"); 



            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:131:23: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                    alt25=2;
                }
                else if ( ((LA25_0 >= '\u0000' && LA25_0 <= '\t')||(LA25_0 >= '\u000B' && LA25_0 <= '\f')||(LA25_0 >= '\u000E' && LA25_0 <= '\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:131:55: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            mLT(); 


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LineComment"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:137:4: ( '\\n' | '\\r' )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "Whitespace"
    public final void mWhitespace() throws RecognitionException {
        try {
            int _type = Whitespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:140:2: ( ( ' ' | LT | '\\t' )+ )
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:140:4: ( ' ' | LT | '\\t' )+
            {
            // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:140:4: ( ' ' | LT | '\\t' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Whitespace"

    public void mTokens() throws RecognitionException {
        // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | Sign | Exp | Float | Integer | String | TiUISize | TiUIFill | TiConst | Identifier | StyleName | WPATH | EXPR | BlockComment | LineComment | Whitespace )
        int alt27=24;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:10: T__39
                {
                mT__39(); 


                }
                break;
            case 2 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:16: T__40
                {
                mT__40(); 


                }
                break;
            case 3 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:22: T__41
                {
                mT__41(); 


                }
                break;
            case 4 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:28: T__42
                {
                mT__42(); 


                }
                break;
            case 5 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:34: T__43
                {
                mT__43(); 


                }
                break;
            case 6 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:40: T__44
                {
                mT__44(); 


                }
                break;
            case 7 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:46: T__45
                {
                mT__45(); 


                }
                break;
            case 8 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:52: T__46
                {
                mT__46(); 


                }
                break;
            case 9 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:58: T__47
                {
                mT__47(); 


                }
                break;
            case 10 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:64: Sign
                {
                mSign(); 


                }
                break;
            case 11 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:69: Exp
                {
                mExp(); 


                }
                break;
            case 12 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:73: Float
                {
                mFloat(); 


                }
                break;
            case 13 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:79: Integer
                {
                mInteger(); 


                }
                break;
            case 14 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:87: String
                {
                mString(); 


                }
                break;
            case 15 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:94: TiUISize
                {
                mTiUISize(); 


                }
                break;
            case 16 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:103: TiUIFill
                {
                mTiUIFill(); 


                }
                break;
            case 17 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:112: TiConst
                {
                mTiConst(); 


                }
                break;
            case 18 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:120: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 19 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:131: StyleName
                {
                mStyleName(); 


                }
                break;
            case 20 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:141: WPATH
                {
                mWPATH(); 


                }
                break;
            case 21 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:147: EXPR
                {
                mEXPR(); 


                }
                break;
            case 22 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:152: BlockComment
                {
                mBlockComment(); 


                }
                break;
            case 23 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:165: LineComment
                {
                mLineComment(); 


                }
                break;
            case 24 :
                // /Users/paul/Desktop/Dropbox/apperson/carbon/Carbon/android/src/appersonlabs/carbon/TSS.g:1:177: Whitespace
                {
                mWhitespace(); 


                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\5\uffff\3\30\2\uffff\1\34\1\30\2\40\1\uffff\2\30\1\uffff\2\30\2"+
        "\uffff\2\30\2\uffff\2\30\1\uffff\1\30\1\uffff\1\36\2\uffff\1\40"+
        "\2\30\2\uffff\6\30\1\uffff\3\30\1\71\1\72\2\30\2\77\1\30\1\102\3"+
        "\uffff\1\30\2\77\2\uffff\1\30\1\uffff\1\30\1\uffff\1\77\1\uffff"+
        "\1\30\3\77\1\30\4\77\1\122\1\123\2\uffff";
    static final String DFA27_eofS =
        "\124\uffff";
    static final String DFA27_minS =
        "\1\11\4\uffff\3\56\2\uffff\1\61\1\53\2\56\1\uffff\2\56\1\uffff\1"+
        "\56\1\53\1\52\1\uffff\2\56\1\uffff\1\101\2\56\1\uffff\1\56\1\uffff"+
        "\1\56\2\uffff\3\56\2\uffff\6\56\1\101\5\56\1\50\5\56\3\uffff\3\56"+
        "\1\uffff\1\101\1\50\1\uffff\1\56\1\101\1\56\1\uffff\13\56\2\uffff";
    static final String DFA27_maxS =
        "\1\175\4\uffff\3\172\2\uffff\1\71\1\172\1\56\1\71\1\uffff\2\172"+
        "\1\uffff\2\172\1\57\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1"+
        "\uffff\1\172\2\uffff\1\71\2\172\2\uffff\22\172\3\uffff\3\172\1\uffff"+
        "\2\172\1\uffff\3\172\1\uffff\13\172\2\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\10\1\11\4\uffff\1\16\2\uffff"+
        "\1\23\3\uffff\1\30\2\uffff\1\22\3\uffff\1\12\1\uffff\1\13\1\uffff"+
        "\1\15\1\14\3\uffff\1\26\1\27\22\uffff\1\6\1\7\1\25\3\uffff\1\21"+
        "\2\uffff\1\5\3\uffff\1\24\13\uffff\1\17\1\20";
    static final String DFA27_specialS =
        "\124\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\1\uffff\1\16\1\21\3\uffff\1"+
            "\16\3\uffff\1\12\1\1\1\12\1\21\1\24\1\14\11\15\1\2\6\uffff\4"+
            "\22\1\23\16\22\1\17\2\22\1\20\3\22\1\3\1\uffff\1\4\1\uffff\1"+
            "\22\1\uffff\4\22\1\13\1\5\7\22\1\6\5\22\1\7\6\22\1\10\1\uffff"+
            "\1\11",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\1\26\31\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\24\27\1\32\5\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\21\27\1\33\10\27",
            "",
            "",
            "\11\15",
            "\1\36\1\uffff\1\36\1\31\1\uffff\12\37\7\uffff\32\27\1\21\3"+
            "\uffff\1\27\1\uffff\27\27\1\35\2\27",
            "\1\41",
            "\1\41\1\uffff\12\42",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\10\27\1\43\21\27",
            "\1\31\1\uffff\12\27\7\uffff\17\27\1\44\12\27\1\21\3\uffff\1"+
            "\27\1\uffff\32\27",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\32\27",
            "\1\36\1\uffff\1\36\1\31\1\uffff\12\37\7\uffff\32\27\1\21\3"+
            "\uffff\1\27\1\uffff\32\27",
            "\1\45\4\uffff\1\46",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\13\27\1\47\16\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\32\27",
            "",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\13\27\1\51\16\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\24\27\1\52\5\27",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\17\27\1\53\12\27",
            "",
            "\1\31\1\uffff\12\37\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\32\27",
            "",
            "",
            "\1\41\1\uffff\12\42",
            "\1\55\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\23\27\1\54\6\27",
            "\1\31\1\uffff\12\27\7\uffff\1\56\31\27\1\21\3\uffff\1\27\1"+
            "\uffff\32\27",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\22\27\1\57\7\27",
            "\1\31\1\uffff\12\60\7\uffff\32\60\1\21\3\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\13\27\1\61\16\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\4\27\1\62\25\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\21\27\1\63\10\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\1\64\31\27",
            "\24\66\1\65\5\66\4\uffff\1\66\1\uffff\32\66",
            "\1\31\1\uffff\12\27\7\uffff\23\27\1\67\6\27\1\21\3\uffff\1"+
            "\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\4\27\1\70\25\27",
            "\1\31\1\uffff\12\60\7\uffff\32\60\1\21\3\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\32\27",
            "\1\73\5\uffff\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff"+
            "\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\15\27\1\74\14\27",
            "\1\100\1\uffff\12\76\7\uffff\10\76\1\75\21\76\1\21\3\uffff"+
            "\1\76\1\uffff\32\76",
            "\1\100\1\uffff\12\76\7\uffff\32\76\1\21\3\uffff\1\76\1\uffff"+
            "\32\76",
            "\1\31\1\uffff\12\27\7\uffff\7\27\1\101\22\27\1\21\3\uffff\1"+
            "\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\32\27",
            "",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\10\27\1\103\21\27",
            "\1\104\1\uffff\12\76\7\uffff\32\76\1\21\3\uffff\1\76\1\uffff"+
            "\32\76",
            "\1\100\1\uffff\12\76\7\uffff\32\76\1\21\3\uffff\1\76\1\uffff"+
            "\32\76",
            "",
            "\32\105\4\uffff\1\105\1\uffff\32\105",
            "\1\106\5\uffff\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff"+
            "\1\27\1\uffff\32\27",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\24\27\1\107\5\27",
            "\5\105\1\111\14\105\1\110\7\105\4\uffff\1\105\1\uffff\32\105",
            "\1\100\1\uffff\12\112\7\uffff\32\112\1\21\3\uffff\1\112\1\uffff"+
            "\32\112",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\14\27\1\113\15\27",
            "\1\100\1\uffff\12\112\7\uffff\10\112\1\114\21\112\1\21\3\uffff"+
            "\1\112\1\uffff\32\112",
            "\1\100\1\uffff\12\112\7\uffff\10\112\1\115\21\112\1\21\3\uffff"+
            "\1\112\1\uffff\32\112",
            "\1\100\1\uffff\12\112\7\uffff\32\112\1\21\3\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\55\1\uffff\12\27\7\uffff\32\27\1\21\3\uffff\1\27\1\uffff"+
            "\32\27",
            "\1\100\1\uffff\12\112\7\uffff\31\112\1\116\1\21\3\uffff\1\112"+
            "\1\uffff\32\112",
            "\1\100\1\uffff\12\112\7\uffff\13\112\1\117\16\112\1\21\3\uffff"+
            "\1\112\1\uffff\32\112",
            "\1\100\1\uffff\12\112\7\uffff\4\112\1\120\25\112\1\21\3\uffff"+
            "\1\112\1\uffff\32\112",
            "\1\100\1\uffff\12\112\7\uffff\13\112\1\121\16\112\1\21\3\uffff"+
            "\1\112\1\uffff\32\112",
            "\1\100\1\uffff\12\112\7\uffff\32\112\1\21\3\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\100\1\uffff\12\112\7\uffff\32\112\1\21\3\uffff\1\112\1\uffff"+
            "\32\112",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | Sign | Exp | Float | Integer | String | TiUISize | TiUIFill | TiConst | Identifier | StyleName | WPATH | EXPR | BlockComment | LineComment | Whitespace );";
        }
    }
 

}