/* Generated By:JavaCC: Do not edit this line. minijavaLex.java */
import java.io.*;

public class minijavaLex implements minijavaLexConstants {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 1) {
            System.out.println("Please pass in the filename for a parameter.");
            System.exit(1);
        }

        SimpleCharStream stream = new SimpleCharStream(new FileInputStream(args[0]), 0, 0);
        Token temp_token = null;

        minijavaLexTokenManager TkMgr = new minijavaLexTokenManager(stream);

        do {
            temp_token = TkMgr.getNextToken();

            switch (temp_token.kind) {
                case AND: System.out.println("AND: " + temp_token.image); break;
                case LESS_THAN: System.out.println("LESS_THAN: " + temp_token.image); break;
                case PLUS: System.out.println("PLUS: " + temp_token.image); break;
                case MINUS: System.out.println("MINUS: " + temp_token.image); break;
                case MULTIPLY: System.out.println("MULTIPLY: " + temp_token.image); break;
                case CLASS: System.out.println("CLASS: " + temp_token.image); break;
                case EXTENDS: System.out.println("EXTENDS: " + temp_token.image); break;
                case PUBLIC: System.out.println("PUBLIC: " + temp_token.image); break;
                case STATIC: System.out.println("STATIC: " + temp_token.image); break;
                case VOID: System.out.println("VOID: " + temp_token.image); break;
                case MAIN: System.out.println("MAIN: " + temp_token.image); break;
                case STRING: System.out.println("STRING: " + temp_token.image); break;
                case INT: System.out.println("INT: " + temp_token.image); break;
                case RETURN: System.out.println("RETURN: " + temp_token.image); break;
                case BOOLEAN: System.out.println("BOOLEAN: " + temp_token.image); break;
                case IF: System.out.println("IF: " + temp_token.image); break;
                case ELSE: System.out.println("ELSE: " + temp_token.image); break;
                case WHILE: System.out.println("WHILE: " + temp_token.image); break;
                case SYSTEM: System.out.println("SYSTEM: " + temp_token.image); break;
                case DOT: System.out.println("DOT: " + temp_token.image); break;
                case OUT: System.out.println("OUT: " + temp_token.image); break;
                case PRINT: System.out.println("PRINT: " + temp_token.image); break;
                case LENGTH: System.out.println("LENGTH: " + temp_token.image); break;
                case TRUE: System.out.println("TRUE: " + temp_token.image); break;
                case FALSE: System.out.println("FALSE: " + temp_token.image); break;
                case THIS: System.out.println("THIS: " + temp_token.image); break;
                case NEW: System.out.println("NEW: " + temp_token.image); break;
                case LPARENS: System.out.println("LPARENS: " + temp_token.image); break;
                case RPARENS: System.out.println("RPARENS: " + temp_token.image); break;
                case LBRACKET: System.out.println("LBRACKET: " + temp_token.image); break;
                case RBRACKET: System.out.println("RBRACKET: " + temp_token.image); break;
                case ASSIGN: System.out.println("ASSIGN: " + temp_token.image); break;
                case SEMI_COMMA: System.out.println("SEMI_COMMA: " + temp_token.image); break;
                case COMMA: System.out.println("COMMA: " + temp_token.image); break;
                case NEGATE: System.out.println("NEGATE: " + temp_token.image); break;
                case L_C_BRACKET: System.out.println("L_C_BRACKET: " + temp_token.image); break;
                case R_C_BRACKET: System.out.println("R_C_BRACKET: " + temp_token.image); break;
                case IDENTIFIER: System.out.println("IDENTIFIER: " + temp_token.image); break;
                case INTEGER_LITERAL: System.out.println("INTEGER_LITERAL: " + temp_token.image); break;
                default:
                    if (temp_token.kind != EOF)
                        System.out.println("OTHER: " + temp_token.image);
                    break;
            }
        } while (temp_token.kind != EOF);
    }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public minijavaLexTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {};
   }

  /** Constructor with InputStream. */
  public minijavaLex(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public minijavaLex(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new minijavaLexTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public minijavaLex(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new minijavaLexTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public minijavaLex(minijavaLexTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(minijavaLexTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List jj_expentries = new java.util.ArrayList();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[52];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 52; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
