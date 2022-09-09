/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.korioz.intellij.lua.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.korioz.intellij.lua.lang.LuaLanguageLevel;

import java.io.Reader;

import static com.korioz.intellij.lua.psi.LuaTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>lua.flex</tt>
 */
public class _LuaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int xSHEBANG = 2;
  public static final int xDOUBLE_QUOTED_STRING = 4;
  public static final int xSINGLE_QUOTED_STRING = 6;
  public static final int xBACKTICK_STRING = 8;
  public static final int xBLOCK_STRING = 10;
  public static final int xCOMMENT = 12;
  public static final int xBLOCK_COMMENT = 14;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  5, 5
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 2320 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\6\200\200\300");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\137\2\100\5");

  /* The ZZ_CMAP_A table has 768 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\36\1\3\1\2\1\0\1\3\1\1\22\36\1\3\1\60\1\34\1\57\1\36\1\65\1\75\1\40\1"+
    "\67\1\70\1\64\1\10\1\71\1\17\1\16\1\66\1\12\11\5\1\73\1\72\1\62\1\32\1\61"+
    "\2\36\4\6\1\7\1\6\5\42\1\15\3\42\1\11\4\42\1\14\2\42\1\13\2\42\1\31\1\35\1"+
    "\33\1\74\1\42\1\41\1\43\1\44\1\52\1\27\1\21\1\50\1\22\1\55\1\23\1\42\1\45"+
    "\1\46\1\42\1\25\1\24\1\54\1\42\1\20\1\47\1\53\1\51\1\42\1\56\1\13\2\42\1\26"+
    "\1\76\1\30\1\63\6\36\1\0\32\36\1\0\136\36\201\37\1\4\177\37\13\4\35\37\2\4"+
    "\5\37\1\4\57\37\1\4\40\37\200\36");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\5\0\1\2\1\3\1\4\1\5\1\6"+
    "\1\5\1\7\1\10\6\4\1\11\1\4\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\7\4\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\3\40\1\0\1\5"+
    "\2\0\1\5\1\0\1\5\1\41\1\42\4\4\1\43"+
    "\1\44\1\45\2\4\1\46\1\47\12\4\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\1\40\2\0"+
    "\1\60\1\0\3\5\1\61\4\0\2\4\1\62\2\4"+
    "\1\63\1\64\1\65\2\4\1\66\6\4\1\60\1\67"+
    "\1\5\6\0\2\4\1\70\1\71\5\4\1\72\1\73"+
    "\1\4\2\0\1\5\2\0\1\74\1\75\3\4\1\76"+
    "\1\77\1\100\1\4\1\101\1\102\1\0\1\5\2\0"+
    "\1\103\1\104\1\105\1\4\3\0\1\4\1\0\1\106"+
    "\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u013b"+
    "\0\u01b9\0\u01f8\0\u0237\0\u013b\0\u0276\0\u02b5\0\u02f4\0\u0333"+
    "\0\u0372\0\u03b1\0\u03f0\0\u042f\0\u046e\0\u013b\0\u04ad\0\u013b"+
    "\0\u013b\0\u04ec\0\u013b\0\u013b\0\u013b\0\u013b\0\u052b\0\u056a"+
    "\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\u0723\0\u0762"+
    "\0\u07a1\0\u013b\0\u013b\0\u07e0\0\u013b\0\u013b\0\u013b\0\u013b"+
    "\0\u081f\0\u013b\0\u013b\0\u013b\0\u085e\0\u089d\0\u08dc\0\u091b"+
    "\0\u095a\0\u0999\0\u09d8\0\u0a17\0\u0a56\0\u0a95\0\u0ad4\0\u0b13"+
    "\0\u0b52\0\u0b91\0\u0bd0\0\u0c0f\0\u01f8\0\u01f8\0\u01f8\0\u0c4e"+
    "\0\u0c8d\0\u01f8\0\u013b\0\u0ccc\0\u0d0b\0\u0d4a\0\u0d89\0\u0dc8"+
    "\0\u0e07\0\u0e46\0\u0e85\0\u0ec4\0\u0f03\0\u013b\0\u013b\0\u013b"+
    "\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u0f42\0\u0f81"+
    "\0\u0fc0\0\u0a95\0\u013b\0\u0fff\0\u103e\0\u013b\0\u107d\0\u10bc"+
    "\0\u10fb\0\u113a\0\u1179\0\u11b8\0\u01f8\0\u11f7\0\u1236\0\u01f8"+
    "\0\u01f8\0\u01f8\0\u1275\0\u12b4\0\u01f8\0\u12f3\0\u1332\0\u1371"+
    "\0\u13b0\0\u13ef\0\u142e\0\u146d\0\u14ac\0\u14eb\0\u152a\0\u1569"+
    "\0\u15a8\0\u15e7\0\u1626\0\u1665\0\u16a4\0\u16e3\0\u1722\0\u01f8"+
    "\0\u1761\0\u17a0\0\u17df\0\u181e\0\u185d\0\u01f8\0\u01f8\0\u189c"+
    "\0\u18db\0\u191a\0\u1959\0\u1998\0\u19d7\0\u1a16\0\u1a55\0\u1a94"+
    "\0\u1ad3\0\u1b12\0\u01f8\0\u01f8\0\u01f8\0\u1b51\0\u01f8\0\u01f8"+
    "\0\u1b90\0\u1bcf\0\u1c0e\0\u1c4d\0\u01f8\0\u01f8\0\u01f8\0\u1c8c"+
    "\0\u1ccb\0\u1d0a\0\u1d49\0\u1d88\0\u1dc7\0\u01f8\0\u1e06\0\u1e45";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\10\3\11\1\12\1\13\2\12\1\14\1\12\1\15"+
    "\3\12\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\2\10\1\12\1\35\1\36\1\12\1\37\1\40\1\12"+
    "\1\41\1\12\1\42\1\43\1\12\1\44\2\12\1\45"+
    "\1\46\1\10\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
    "\1\2\2\0\74\2\34\0\1\65\102\0\1\66\77\0"+
    "\1\67\153\0\1\70\60\0\3\11\77\0\4\12\1\0"+
    "\5\12\2\0\6\12\1\0\1\12\7\0\1\12\2\0"+
    "\15\12\25\0\1\13\1\0\1\71\2\0\1\13\1\0"+
    "\1\72\1\73\1\74\2\0\1\71\62\0\1\13\1\0"+
    "\1\71\2\0\1\13\1\75\1\72\1\73\1\74\2\0"+
    "\1\71\62\0\1\76\4\0\1\76\3\0\1\77\77\0"+
    "\1\100\63\0\4\12\1\0\5\12\2\0\1\12\1\101"+
    "\4\12\1\0\1\12\7\0\1\12\2\0\15\12\24\0"+
    "\4\12\1\0\5\12\2\0\5\12\1\102\1\0\1\12"+
    "\7\0\1\12\2\0\4\12\1\103\10\12\24\0\4\12"+
    "\1\0\5\12\2\0\4\12\1\104\1\12\1\0\1\12"+
    "\7\0\1\12\2\0\15\12\24\0\4\12\1\0\5\12"+
    "\2\0\5\12\1\105\1\0\1\12\7\0\1\12\2\0"+
    "\6\12\1\106\6\12\24\0\4\12\1\0\5\12\2\0"+
    "\1\107\5\12\1\0\1\12\7\0\1\12\2\0\15\12"+
    "\24\0\4\12\1\0\5\12\2\0\3\12\1\110\1\111"+
    "\1\12\1\0\1\12\7\0\1\12\2\0\15\12\24\0"+
    "\4\12\1\0\5\12\2\0\4\12\1\112\1\12\1\0"+
    "\1\12\7\0\1\12\2\0\15\12\52\0\1\113\50\0"+
    "\4\12\1\0\5\12\2\0\5\12\1\114\1\0\1\12"+
    "\7\0\1\12\2\0\15\12\24\0\4\12\1\0\5\12"+
    "\2\0\1\115\5\12\1\0\1\12\7\0\1\12\2\0"+
    "\15\12\24\0\4\12\1\0\5\12\2\0\4\12\1\116"+
    "\1\12\1\0\1\12\7\0\1\12\2\0\15\12\24\0"+
    "\4\12\1\0\5\12\2\0\4\12\1\117\1\12\1\0"+
    "\1\12\7\0\1\12\2\0\1\12\1\120\5\12\1\121"+
    "\5\12\24\0\4\12\1\0\5\12\2\0\5\12\1\122"+
    "\1\0\1\12\7\0\1\12\2\0\15\12\24\0\4\12"+
    "\1\0\5\12\2\0\1\123\5\12\1\0\1\12\7\0"+
    "\1\12\2\0\13\12\1\124\1\12\24\0\4\12\1\0"+
    "\5\12\2\0\6\12\1\0\1\12\7\0\1\12\2\0"+
    "\13\12\1\125\1\12\100\0\1\126\50\0\1\127\26\0"+
    "\1\130\47\0\1\131\27\0\1\132\46\0\1\133\132\0"+
    "\1\134\103\0\1\135\3\0\34\65\1\136\1\137\41\65"+
    "\35\66\1\140\2\66\1\136\36\66\5\0\3\67\1\0"+
    "\5\67\2\0\6\67\1\0\1\67\11\0\1\136\15\67"+
    "\37\0\1\141\64\0\1\76\2\0\1\142\1\0\1\76"+
    "\4\0\1\142\74\0\1\73\76\0\1\143\66\0\1\144"+
    "\4\0\1\144\71\0\3\145\2\0\1\145\6\0\1\145"+
    "\5\0\1\145\13\0\2\145\3\0\1\145\1\0\1\145"+
    "\31\0\1\76\4\0\1\76\102\0\1\146\100\0\1\147"+
    "\1\150\4\0\1\151\1\0\1\152\52\0\4\12\1\0"+
    "\5\12\2\0\6\12\1\0\1\12\7\0\1\12\2\0"+
    "\11\12\1\153\1\154\2\12\24\0\4\12\1\0\5\12"+
    "\2\0\6\12\1\0\1\155\7\0\1\12\2\0\15\12"+
    "\24\0\4\12\1\0\5\12\2\0\6\12\1\0\1\12"+
    "\7\0\1\12\2\0\5\12\1\156\7\12\24\0\4\12"+
    "\1\0\5\12\2\0\6\12\1\0\1\12\7\0\1\12"+
    "\2\0\11\12\1\157\3\12\24\0\4\12\1\0\5\12"+
    "\2\0\6\12\1\0\1\12\7\0\1\12\2\0\4\12"+
    "\1\160\10\12\24\0\4\12\1\0\5\12\2\0\6\12"+
    "\1\0\1\12\7\0\1\12\2\0\11\12\1\161\3\12"+
    "\24\0\4\12\1\0\5\12\2\0\6\12\1\0\1\162"+
    "\7\0\1\12\2\0\15\12\24\0\4\12\1\0\5\12"+
    "\2\0\1\12\1\163\4\12\1\0\1\12\7\0\1\12"+
    "\2\0\15\12\24\0\4\12\1\0\5\12\2\0\6\12"+
    "\1\0\1\12\7\0\1\12\2\0\10\12\1\164\4\12"+
    "\24\0\4\12\1\0\5\12\2\0\1\165\5\12\1\0"+
    "\1\12\7\0\1\12\2\0\15\12\24\0\4\12\1\0"+
    "\5\12\2\0\6\12\1\0\1\12\7\0\1\12\2\0"+
    "\4\12\1\166\10\12\24\0\4\12\1\0\5\12\2\0"+
    "\5\12\1\167\1\0\1\12\7\0\1\12\2\0\15\12"+
    "\24\0\4\12\1\0\5\12\2\0\6\12\1\0\1\12"+
    "\7\0\1\12\2\0\11\12\1\170\3\12\24\0\4\12"+
    "\1\0\5\12\2\0\6\12\1\0\1\12\7\0\1\12"+
    "\2\0\7\12\1\171\5\12\24\0\4\12\1\0\5\12"+
    "\2\0\1\12\1\172\4\12\1\0\1\12\7\0\1\12"+
    "\2\0\15\12\24\0\4\12\1\0\5\12\2\0\3\12"+
    "\1\173\2\12\1\0\1\12\7\0\1\12\2\0\15\12"+
    "\21\0\2\65\2\0\72\65\1\0\2\66\2\0\72\66"+
    "\1\174\2\0\14\174\1\175\57\174\5\0\1\144\1\0"+
    "\1\71\2\0\1\144\6\0\1\71\62\0\2\145\1\176"+
    "\1\0\1\177\1\145\1\0\1\72\1\73\1\200\2\0"+
    "\1\176\5\0\1\145\13\0\2\145\3\0\1\145\1\0"+
    "\1\145\1\0\1\177\43\0\1\201\102\0\1\202\77\0"+
    "\1\203\100\0\1\204\52\0\4\12\1\0\5\12\2\0"+
    "\6\12\1\0\1\12\7\0\1\12\2\0\7\12\1\205"+
    "\5\12\24\0\4\12\1\0\5\12\2\0\1\12\1\206"+
    "\4\12\1\0\1\12\7\0\1\12\2\0\15\12\24\0"+
    "\4\12\1\0\5\12\2\0\1\12\1\207\4\12\1\0"+
    "\1\12\7\0\1\12\2\0\15\12\24\0\4\12\1\0"+
    "\5\12\2\0\4\12\1\210\1\12\1\0\1\12\7\0"+
    "\1\12\2\0\15\12\24\0\4\12\1\0\5\12\2\0"+
    "\6\12\1\0\1\12\7\0\1\12\2\0\1\12\1\211"+
    "\13\12\24\0\4\12\1\0\5\12\2\0\6\12\1\0"+
    "\1\12\7\0\1\12\2\0\1\12\1\212\13\12\24\0"+
    "\4\12\1\0\5\12\2\0\6\12\1\0\1\12\7\0"+
    "\1\12\2\0\5\12\1\213\7\12\24\0\4\12\1\0"+
    "\5\12\2\0\6\12\1\0\1\12\7\0\1\12\2\0"+
    "\10\12\1\214\4\12\24\0\4\12\1\0\5\12\2\0"+
    "\3\12\1\215\2\12\1\0\1\12\7\0\1\12\2\0"+
    "\15\12\24\0\4\12\1\0\5\12\2\0\1\12\1\216"+
    "\4\12\1\0\1\12\7\0\1\12\2\0\15\12\24\0"+
    "\4\12\1\0\5\12\2\0\5\12\1\217\1\0\1\12"+
    "\7\0\1\12\2\0\15\12\24\0\4\12\1\0\5\12"+
    "\2\0\6\12\1\0\1\12\7\0\1\12\2\0\4\12"+
    "\1\220\10\12\20\0\1\174\2\0\74\174\1\175\1\221"+
    "\1\222\74\175\5\0\2\145\1\176\1\142\1\177\1\145"+
    "\1\0\1\72\1\73\1\200\1\142\1\0\1\176\5\0"+
    "\1\145\13\0\2\145\3\0\1\145\1\0\1\145\1\0"+
    "\1\177\32\0\1\142\6\0\1\142\64\0\3\223\2\0"+
    "\1\223\6\0\1\223\5\0\1\223\13\0\2\223\3\0"+
    "\1\223\1\0\1\223\46\0\1\224\103\0\1\225\75\0"+
    "\1\226\100\0\1\227\52\0\4\12\1\0\5\12\2\0"+
    "\1\230\5\12\1\0\1\12\7\0\1\12\2\0\15\12"+
    "\24\0\4\12\1\0\5\12\2\0\6\12\1\0\1\12"+
    "\7\0\1\12\2\0\1\12\1\231\13\12\24\0\4\12"+
    "\1\0\5\12\2\0\3\12\1\232\2\12\1\0\1\12"+
    "\7\0\1\12\2\0\15\12\24\0\4\12\1\0\5\12"+
    "\2\0\6\12\1\0\1\12\7\0\1\12\2\0\3\12"+
    "\1\233\11\12\24\0\4\12\1\0\5\12\2\0\6\12"+
    "\1\0\1\12\7\0\1\12\2\0\4\12\1\234\10\12"+
    "\24\0\4\12\1\0\5\12\2\0\1\12\1\235\4\12"+
    "\1\0\1\12\7\0\1\12\2\0\15\12\24\0\4\12"+
    "\1\0\5\12\2\0\6\12\1\0\1\12\7\0\1\12"+
    "\2\0\11\12\1\236\3\12\24\0\4\12\1\0\5\12"+
    "\2\0\6\12\1\0\1\12\7\0\1\12\2\0\4\12"+
    "\1\237\10\12\24\0\4\12\1\0\5\12\2\0\1\12"+
    "\1\240\4\12\1\0\1\12\7\0\1\12\2\0\15\12"+
    "\22\0\1\222\77\0\1\222\13\0\1\241\64\0\2\223"+
    "\1\242\1\0\1\177\1\223\6\0\1\242\5\0\1\223"+
    "\13\0\2\223\3\0\1\223\1\0\1\223\1\0\1\177"+
    "\45\0\1\243\73\0\1\244\56\0\1\226\2\0\74\226"+
    "\1\227\2\0\74\227\4\0\4\12\1\0\5\12\2\0"+
    "\5\12\1\245\1\0\1\12\7\0\1\12\2\0\15\12"+
    "\24\0\4\12\1\0\5\12\2\0\6\12\1\0\1\12"+
    "\7\0\1\12\2\0\11\12\1\246\3\12\24\0\4\12"+
    "\1\0\5\12\2\0\6\12\1\0\1\12\7\0\1\12"+
    "\2\0\6\12\1\247\6\12\24\0\4\12\1\0\5\12"+
    "\2\0\3\12\1\250\2\12\1\0\1\12\7\0\1\12"+
    "\2\0\15\12\37\0\1\251\64\0\2\223\1\242\1\142"+
    "\1\177\1\223\4\0\1\142\1\0\1\242\5\0\1\223"+
    "\13\0\2\223\3\0\1\223\1\0\1\223\1\0\1\177"+
    "\46\0\1\252\73\0\1\253\61\0\4\12\1\0\5\12"+
    "\2\0\4\12\1\254\1\12\1\0\1\12\7\0\1\12"+
    "\2\0\15\12\37\0\1\175\104\0\1\226\73\0\1\255"+
    "\60\0\4\12\1\0\5\12\2\0\5\12\1\256\1\0"+
    "\1\12\7\0\1\12\2\0\15\12\43\0\1\257\77\0"+
    "\1\260\77\0\1\227\51\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7812];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\3\0\1\10\1\0\1\11\3\1\1\11"+
    "\11\1\1\11\1\1\2\11\1\1\4\11\13\1\2\11"+
    "\1\1\4\11\1\1\3\11\3\1\1\0\1\1\2\0"+
    "\1\1\1\0\15\1\1\11\12\1\11\11\2\0\1\1"+
    "\1\0\1\11\2\1\1\11\4\0\24\1\6\0\14\1"+
    "\2\0\1\1\2\0\13\1\1\0\1\1\2\0\4\1"+
    "\3\0\1\1\1\0\1\1\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private LuaLanguageLevel level = LuaLanguageLevel.LUA54;
    public _LuaLexer(LuaLanguageLevel level) {
        this((Reader) null);
        this.level = level;
    }

    private int nBrackets = 0;
    private boolean checkAhead(char c, int offset) {
        return this.zzMarkedPos + offset < this.zzBuffer.length() && this.zzBuffer.charAt(this.zzMarkedPos + offset) == c;
    }

    private boolean checkBlock() {
        nBrackets = 0;
        if (checkAhead('[', 0)) {
            int n = 0;
            while (checkAhead('=', n + 1)) n++;
            if (checkAhead('[', n + 1)) {
                nBrackets = n;
                return true;
            }
        }
        return false;
    }

    private int checkBlockEnd() {
        int pos = zzMarkedPos;
        int end = zzEndRead;
        while(pos < end) {
            char c = zzBuffer.charAt(pos);
            if (c == ']') {
                pos++;
                int size = 0;
                while (pos < zzEndRead && zzBuffer.charAt(pos) == '=') {
                    size++;
                    pos++;
                }
                if (size == nBrackets && pos < zzEndRead && zzBuffer.charAt(pos) == ']') {
                    pos++;
                    break;
                }
                continue;
            }
            pos++;
        }
        return pos - zzMarkedPos;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _LuaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(YYINITIAL); return SHEBANG_CONTENT;
            } 
            // fall through
          case 71: break;
          case 2: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 72: break;
          case 3: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 73: break;
          case 4: 
            { return ID;
            } 
            // fall through
          case 74: break;
          case 5: 
            { return NUMBER;
            } 
            // fall through
          case 75: break;
          case 6: 
            { return PLUS;
            } 
            // fall through
          case 76: break;
          case 7: 
            { return DOT;
            } 
            // fall through
          case 77: break;
          case 8: 
            { return MINUS;
            } 
            // fall through
          case 78: break;
          case 9: 
            { return LCURLY;
            } 
            // fall through
          case 79: break;
          case 10: 
            { return RCURLY;
            } 
            // fall through
          case 80: break;
          case 11: 
            { if (checkAhead('=', 0) || checkAhead('[', 0)) {
          yypushback(yylength());
          checkBlock();
          zzMarkedPos += checkBlockEnd();
          return STRING;
      } else {
          return LBRACK;
      }
            } 
            // fall through
          case 81: break;
          case 12: 
            { return ASSIGN;
            } 
            // fall through
          case 82: break;
          case 13: 
            { return RBRACK;
            } 
            // fall through
          case 83: break;
          case 14: 
            { yybegin(xDOUBLE_QUOTED_STRING); yypushback(yylength());
            } 
            // fall through
          case 84: break;
          case 15: 
            { yybegin(xSINGLE_QUOTED_STRING); yypushback(yylength());
            } 
            // fall through
          case 85: break;
          case 16: 
            { yybegin(xBACKTICK_STRING); yypushback(yylength());
            } 
            // fall through
          case 86: break;
          case 17: 
            { return GETN;
            } 
            // fall through
          case 87: break;
          case 18: 
            { return GT;
            } 
            // fall through
          case 88: break;
          case 19: 
            { return LT;
            } 
            // fall through
          case 89: break;
          case 20: 
            { return BIT_TILDE;
            } 
            // fall through
          case 90: break;
          case 21: 
            { return MULT;
            } 
            // fall through
          case 91: break;
          case 22: 
            { return MOD;
            } 
            // fall through
          case 92: break;
          case 23: 
            { return DIV;
            } 
            // fall through
          case 93: break;
          case 24: 
            { return LPAREN;
            } 
            // fall through
          case 94: break;
          case 25: 
            { return RPAREN;
            } 
            // fall through
          case 95: break;
          case 26: 
            { return COMMA;
            } 
            // fall through
          case 96: break;
          case 27: 
            { return SEMI;
            } 
            // fall through
          case 97: break;
          case 28: 
            { return COLON;
            } 
            // fall through
          case 98: break;
          case 29: 
            { return EXP;
            } 
            // fall through
          case 99: break;
          case 30: 
            { return BIT_AND;
            } 
            // fall through
          case 100: break;
          case 31: 
            { return BIT_OR;
            } 
            // fall through
          case 101: break;
          case 32: 
            { yybegin(YYINITIAL); return STRING;
            } 
            // fall through
          case 102: break;
          case 33: 
            { return CONCAT;
            } 
            // fall through
          case 103: break;
          case 34: 
            { boolean block = checkBlock();
        if (block) {
            yypushback(yylength());
            zzMarkedPos += checkBlockEnd();
            return BLOCK_COMMENT;
        }
        else { yypushback(yylength()); yybegin(xCOMMENT); }
            } 
            // fall through
          case 104: break;
          case 35: 
            { return IN;
            } 
            // fall through
          case 105: break;
          case 36: 
            { return IF;
            } 
            // fall through
          case 106: break;
          case 37: 
            { return OR;
            } 
            // fall through
          case 107: break;
          case 38: 
            { return DO;
            } 
            // fall through
          case 108: break;
          case 39: 
            { return EQ;
            } 
            // fall through
          case 109: break;
          case 40: 
            { yybegin(xSHEBANG); return SHEBANG;
            } 
            // fall through
          case 110: break;
          case 41: 
            { return GE;
            } 
            // fall through
          case 111: break;
          case 42: 
            { return BIT_RTRT;
            } 
            // fall through
          case 112: break;
          case 43: 
            { return LE;
            } 
            // fall through
          case 113: break;
          case 44: 
            { return BIT_LTLT;
            } 
            // fall through
          case 114: break;
          case 45: 
            { return NE;
            } 
            // fall through
          case 115: break;
          case 46: 
            { return DOUBLE_DIV;
            } 
            // fall through
          case 116: break;
          case 47: 
            { return DOUBLE_COLON;
            } 
            // fall through
          case 117: break;
          case 48: 
            { yybegin(YYINITIAL);return SHORT_COMMENT;
            } 
            // fall through
          case 118: break;
          case 49: 
            { return ELLIPSIS;
            } 
            // fall through
          case 119: break;
          case 50: 
            { return END;
            } 
            // fall through
          case 120: break;
          case 51: 
            { return NIL;
            } 
            // fall through
          case 121: break;
          case 52: 
            { return NOT;
            } 
            // fall through
          case 122: break;
          case 53: 
            { return AND;
            } 
            // fall through
          case 123: break;
          case 54: 
            { return FOR;
            } 
            // fall through
          case 124: break;
          case 55: 
            { yybegin(YYINITIAL);return DOC_COMMENT;
            } 
            // fall through
          case 125: break;
          case 56: 
            { return ELSE;
            } 
            // fall through
          case 126: break;
          case 57: 
            { if (level.getVersion() < LuaLanguageLevel.LUA52.getVersion()) return ID; else return GOTO;
            } 
            // fall through
          case 127: break;
          case 58: 
            { return TRUE;
            } 
            // fall through
          case 128: break;
          case 59: 
            { return THEN;
            } 
            // fall through
          case 129: break;
          case 60: 
            { return REGION;
            } 
            // fall through
          case 130: break;
          case 61: 
            { return ENDREGION;
            } 
            // fall through
          case 131: break;
          case 62: 
            { return BREAK;
            } 
            // fall through
          case 132: break;
          case 63: 
            { return LOCAL;
            } 
            // fall through
          case 133: break;
          case 64: 
            { return FALSE;
            } 
            // fall through
          case 134: break;
          case 65: 
            { return UNTIL;
            } 
            // fall through
          case 135: break;
          case 66: 
            { return WHILE;
            } 
            // fall through
          case 136: break;
          case 67: 
            { return RETURN;
            } 
            // fall through
          case 137: break;
          case 68: 
            { return REPEAT;
            } 
            // fall through
          case 138: break;
          case 69: 
            { return ELSEIF;
            } 
            // fall through
          case 139: break;
          case 70: 
            { return FUNCTION;
            } 
            // fall through
          case 140: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
