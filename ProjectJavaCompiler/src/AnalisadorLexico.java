/* Generated By:JavaCC: Do not edit this line. AnalisadorLexico.java */
public class AnalisadorLexico implements AnalisadorLexicoConstants {
                private static String myFile = "";
        // fun��o para abertura de arquivo a ser usado como source para leitura de tokens
        public static java.io.BufferedReader abreArquivo (String file){
                java.io.BufferedReader in;
                java.io.File arquivinho = new java.io.File(file);
        try {
                in= new java.io.BufferedReader(new java.io.FileReader(arquivinho));
        } catch(java.io.IOException e) {
                in = null;
                System.out.println("Arquivo n\u00e3o pode ser aberto.");
        }
                return (in);
        }
  public static void main(String args[]) throws ParseException {

        //Verifica tipo qual ser� o tipo de entrada
        Object[] options = {"Usar arquivo", "Usar console"};
                  int tipoEntrada = javax.swing.JOptionPane.showOptionDialog(null,
                                    "Qual ser\u00e1 o tipo de entrada dos dados?",
                                    "Entrada",
                                    javax.swing.JOptionPane.YES_NO_OPTION,
                                    javax.swing.JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options,options[0]);

        // Receba o arquivo aberto, leia uma linha 
         try {

           if(tipoEntrada == javax.swing.JOptionPane.YES_OPTION) {
                //Verifica se ja nao ha arquivo escolhido
                        if (myFile.equals("")){
                                //Cria o Seletor de arquivos e seta o disco "C:" como default
                                javax.swing.JFileChooser arquivo = new javax.swing.JFileChooser();

                                //Habilita para escolha  
                    arquivo.showOpenDialog(null);
                    //Recebe o Path do arquivo
                    myFile = arquivo.getSelectedFile().getAbsolutePath();
                            //Abre o arquivo no endereco escolhido
                        java.io.BufferedReader aux = abreArquivo(myFile);
                    String str;
                    java.io.StringReader sr = new java.io.StringReader( aux.readLine());
                        java.io.Reader r = new java.io.BufferedReader( sr );
                        AnalisadorLexico parser = new AnalisadorLexico( abreArquivo(myFile));
                        java.io.BufferedReader in = aux;

                    // enquanto houverem linhas, as leio;
                    while ((str = in.readLine()) != null) {
                        sr = new java.io.StringReader( str);
                                r = new java.io.BufferedReader( sr );
                    }
                    //Encerra o buffer  
                    in.close();
                        }
                }else {
                                AnalisadorLexico parser = new AnalisadorLexico( System.in);
                  }
    } catch (java.io.IOException e) {
         javax.swing.JOptionPane.showMessageDialog(null,"Erro ao iniciar o Analisador Lexico!");
    }

//	Token aux;
//	tokenGUI gui = new tokenGUI();
        try {
         main();
         System.out.println("Entrada aceita");
    }
        catch (ParseException es) {
                System.out.println(es);
                System.exit(0);
        }

 /*   while ((aux = token_source.getNextToken()).kind != 0) { // 0 = EOF
    	gui.setMsg(cospeToken(aux)); 
        
    }*/
  }

        public static String cospeToken( Token recebido) {
                // recebe o token e verifica o tipo (vide eg1Constants)

                System.out.println("proximo: "+ TipoToken.nomeToken[recebido.kind]);

                return ("proximo: "+ TipoToken.nomeToken[recebido.kind]);
        }

  static final public int main() throws ParseException {
    jj_consume_token(BEGIN);
    jj_consume_token(ID);
    jj_consume_token(PONTO_VIRG);
    label_1:
    while (true) {
      bloco();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEGER:
      case FLOAT:
      case STRING:
      case DELIMITADOR_ESQ:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
    }
    jj_consume_token(0);
 {if (true) return 0;}
    throw new Error("Missing return statement in function");
  }

  static final public void bloco() throws ParseException {
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEGER:
      case FLOAT:
      case STRING:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      declara_variaveis();
    }
    jj_consume_token(DELIMITADOR_ESQ);
    comando();
    jj_consume_token(DELIMITADOR_DIR);
  }

  static final public void comando() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      atribuicao();
      break;
    default:
      jj_la1[5] = jj_gen;
      if (jj_2_1(2)) {
        jj_consume_token(IF);
        expressao_logica();
        jj_consume_token(THEN);
        comando();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ELSE:
          jj_consume_token(ELSE);
          comando();
          break;
        default:
          jj_la1[2] = jj_gen;
          ;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case DELIMITADOR_ESQ:
          jj_consume_token(DELIMITADOR_ESQ);
          comando();
          jj_consume_token(DELIMITADOR_DIR);
          break;
        default:
          jj_la1[3] = jj_gen;
          ;
        }
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case FOR:
          jj_consume_token(FOR);
          atribuicao();
          jj_consume_token(TO);
          extremidade_expressao();
          comando();
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case DELIMITADOR_ESQ:
            jj_consume_token(DELIMITADOR_ESQ);
            comando();
            jj_consume_token(DELIMITADOR_DIR);
            break;
          default:
            jj_la1[4] = jj_gen;
            ;
          }
          break;
        default:
          jj_la1[6] = jj_gen;
           System.out.println("Fim comando");
        }
      }
    }
  }

  static final public void atribuicao() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ATRIBUICAO);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMBER:
      jj_consume_token(NUMBER);
      break;
    case DELIMITAR_STRING:
      jj_consume_token(DELIMITAR_STRING);
      jj_consume_token(ID);
      jj_consume_token(DELIMITAR_STRING);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PONTO_VIRG);
  }

  static final public void declara_variaveis() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER:
      jj_consume_token(INTEGER);
      label_3:
      while (true) {
        identificador_variaveis();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
        case VIRGULA:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_3;
        }
      }
      jj_consume_token(PONTO_VIRG);
      break;
    case FLOAT:
      jj_consume_token(FLOAT);
      label_4:
      while (true) {
        identificador_variaveis();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
        case VIRGULA:
          ;
          break;
        default:
          jj_la1[9] = jj_gen;
          break label_4;
        }
      }
      jj_consume_token(PONTO_VIRG);
      break;
    case STRING:
      jj_consume_token(STRING);
      label_5:
      while (true) {
        identificador_variaveis();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
        case VIRGULA:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_5;
        }
      }
      jj_consume_token(PONTO_VIRG);
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void identificador_variaveis() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VIRGULA:
      jj_consume_token(VIRGULA);
      jj_consume_token(ID);
      break;
    case ID:
      jj_consume_token(ID);
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void expressao_matematica() throws ParseException {
    extremidade_expressao();
    label_6:
    while (true) {
      operador_matematico();
      extremidade_expressao();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SUM:
      case SUBTRACTION:
      case MULTIPLICATION:
      case DIVISION:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_6;
      }
    }
  }

  static final public void expressao_logica() throws ParseException {
    extremidade_expressao();
    label_7:
    while (true) {
      operador_logico();
      extremidade_expressao();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BIGGER:
      case MINOR:
      case MINOR_EQUAL:
      case BIGGER_EQUAL:
      case DIFERENTE:
      case EQUAL:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_7;
      }
    }
  }

  static final public void extremidade_expressao() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      break;
    case NUMBER:
      jj_consume_token(NUMBER);
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void operador_matematico() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SUM:
      jj_consume_token(SUM);
      break;
    case SUBTRACTION:
      jj_consume_token(SUBTRACTION);
      break;
    case MULTIPLICATION:
      jj_consume_token(MULTIPLICATION);
      break;
    case DIVISION:
      jj_consume_token(DIVISION);
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void operador_logico() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BIGGER:
      jj_consume_token(BIGGER);
      break;
    case MINOR:
      jj_consume_token(MINOR);
      break;
    case MINOR_EQUAL:
      jj_consume_token(MINOR_EQUAL);
      break;
    case BIGGER_EQUAL:
      jj_consume_token(BIGGER_EQUAL);
      break;
    case DIFERENTE:
      jj_consume_token(DIFERENTE);
      break;
    case EQUAL:
      jj_consume_token(EQUAL);
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_3R_8() {
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_scan_token(IF)) return true;
    if (jj_3R_8()) return true;
    return false;
  }

  static private boolean jj_3R_9() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(29)) {
    jj_scanpos = xsp;
    if (jj_scan_token(14)) return true;
    }
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public AnalisadorLexicoTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[18];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x101c0,0x1c0,0x800,0x10000,0x10000,0x20000000,0x1000,0x40004000,0x20000000,0x20000000,0x20000000,0x1c0,0x20000000,0x3c0000,0x1f800000,0x20004000,0x3c0000,0x1f800000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x1,0x1,0x0,0x1,0x0,0x0,0x0,0x0,0x0,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[1];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public AnalisadorLexico(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public AnalisadorLexico(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AnalisadorLexicoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
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
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public AnalisadorLexico(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AnalisadorLexicoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public AnalisadorLexico(AnalisadorLexicoTokenManager tm) {
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
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(AnalisadorLexicoTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
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

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[33];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 18; i++) {
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
    for (int i = 0; i < 33; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 1; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}