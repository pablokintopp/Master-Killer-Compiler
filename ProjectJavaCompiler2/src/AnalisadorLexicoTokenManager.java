/* Generated By:JavaCC: Do not edit this line. AnalisadorLexicoTokenManager.java */

/** Token Manager. */
public class AnalisadorLexicoTokenManager implements AnalisadorLexicoConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x43fe0L) != 0L)
         {
            jjmatchedKind = 30;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x42fe0L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
            return 1;
         }
         if ((active0 & 0x1000L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0x42fe0L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x42fe0L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x427e0L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x800L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x407e0L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x2000L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x80L) != 0L)
            return 1;
         if ((active0 & 0x40760L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 6;
            return 1;
         }
         return -1;
      case 7:
         if ((active0 & 0x20L) != 0L)
            return 1;
         if ((active0 & 0x40740L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 7;
            return 1;
         }
         return -1;
      case 8:
         if ((active0 & 0x200L) != 0L)
            return 1;
         if ((active0 & 0x40540L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 8;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 39:
         return jjStopAtPos(0, 31);
      case 42:
         return jjStopAtPos(0, 21);
      case 43:
         return jjStopAtPos(0, 19);
      case 44:
         return jjStopAtPos(0, 33);
      case 45:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 47:
         return jjStopAtPos(0, 22);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 59:
         return jjStopAtPos(0, 32);
      case 60:
         jjmatchedKind = 25;
         return jjMoveStringLiteralDfa1_0(0x14020000L);
      case 61:
         return jjStopAtPos(0, 29);
      case 62:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400c0L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x100L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      case 58:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         break;
      case 61:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 62:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2100L);
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 1);
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x820L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0xe0L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x900L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x2800L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x40200L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x40040L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x2a0L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x2100L);
      case 109:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 1);
         break;
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x20L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x140L);
      case 122:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x500L);
      case 108:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(6, 7, 1);
         break;
      case 113:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(7, 5, 1);
         break;
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x40L);
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      case 120:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      case 121:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x40L);
      case 100:
         return jjMoveStringLiteralDfa9_0(active0, 0x400L);
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(8, 9, 1);
         break;
      case 112:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(9, 18, 1);
         break;
      case 108:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(9, 6, 1);
         break;
      case 111:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(9, 8, 1);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(9, 10, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 5;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAddTwoStates(2, 3);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAdd(4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 5 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\143\157\155\155\145\156\143\145", 
"\156\165\155\156\141\164\165\162\141\154", "\156\165\155\162\145\141\154", "\166\141\162\144\151\164\145\170\164\157", 
"\165\155\141\166\145\172\161\165\145", "\141\163\163\151\155\163\145\156\144\157", "\160\157\162\145\155", 
"\144\145", "\154\141\143\145\151\145", null, null, "\55\76", "\74\55", 
"\156\145\167\166\141\162\164\171\160\145", "\53", "\55", "\52", "\57", "\72\72", "\76", "\74", "\74\75", "\76\75", 
"\74\76", "\75", null, "\47", "\73", "\54", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[5];
static private final int[] jjstateSet = new int[10];
static protected char curChar;
/** Constructor. */
public AnalisadorLexicoTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public AnalisadorLexicoTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 5; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   t.image = curTokenImage;

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}