/* Generated By:JavaCC: Do not edit this line. QueryParserTokenManager.java */
package experimentseswc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

/** Token Manager. */
public class QueryParserTokenManager implements QueryParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStartNfaWithStates_0(0, 2, 63);
      case 10:
         return jjStartNfaWithStates_0(0, 3, 63);
      case 32:
         return jjStartNfaWithStates_0(0, 1, 63);
      case 40:
         return jjStopAtPos(0, 14);
      case 41:
         return jjStopAtPos(0, 15);
      case 42:
         return jjStopAtPos(0, 21);
      case 46:
         return jjStartNfaWithStates_0(0, 18, 63);
      case 58:
         return jjStopAtPos(0, 16);
      case 97:
         return jjStartNfaWithStates_0(0, 22, 62);
      case 123:
         return jjStopAtPos(0, 13);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 63;
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
                  if ((0x7000000000000000L & l) != 0L)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  else if ((0x100000600L & l) != 0L)
                     jjCheckNAddTwoStates(51, 52);
                  else if ((0x8400000000L & l) != 0L)
                     jjCheckNAddTwoStates(45, 46);
                  else if (curChar == 33)
                     jjCheckNAdd(54);
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(51, 52);
                  else if ((0x8000001000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 48;
                  if (curChar == 60)
                     jjCheckNAdd(59);
                  else if (curChar == 62)
                     jjCheckNAdd(54);
                  if (curChar == 60)
                     jjCheckNAdd(54);
                  break;
               case 63:
               case 51:
                  if ((0x100000600L & l) != 0L)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 44:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddTwoStates(45, 46);
                  break;
               case 45:
                  if ((0xffffff7bffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(45, 46);
                  break;
               case 46:
                  if ((0x8400000000L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 47:
                  if ((0x8000001000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 48;
                  break;
               case 49:
                  if ((0xffffbffeffffdbffL & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 50:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 53:
                  if ((0x7000000000000000L & l) != 0L && kind > 19)
                     kind = 19;
                  break;
               case 54:
                  if (curChar == 61 && kind > 19)
                     kind = 19;
                  break;
               case 55:
                  if (curChar == 33)
                     jjCheckNAdd(54);
                  break;
               case 56:
                  if (curChar == 60)
                     jjCheckNAdd(54);
                  break;
               case 57:
                  if (curChar == 62)
                     jjCheckNAdd(54);
                  break;
               case 58:
                  if (curChar == 60)
                     jjCheckNAdd(59);
                  break;
               case 59:
                  if ((0xfffffffeffffd9ffL & l) != 0L)
                     jjCheckNAddTwoStates(59, 60);
                  break;
               case 60:
                  if (curChar == 62 && kind > 20)
                     kind = 20;
                  break;
               case 62:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjstateSet[jjnewStateCnt++] = 62;
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
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     jjCheckNAdd(62);
                  }
                  else if (curChar == 125)
                  {
                     if (kind > 17)
                        kind = 17;
                  }
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 39;
                  else if ((0x80000000800000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  else if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  else if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  else if (curChar == 114)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 63:
                  if (curChar == 125)
                  {
                     if (kind > 17)
                        kind = 17;
                  }
                  else if (curChar == 114)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 1:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0x400000004000L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 5:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x4000000040000L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 11:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 16:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x100000001000L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 19:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x10000000100000L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 25:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 30:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 32:
                  if ((0x10000000100000L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 33:
                  if ((0x80000000800000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 34:
                  if ((0x10000000100L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 35:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 36:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 37:
                  if ((0x2000000020L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 38:
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 39:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 40:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 41:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 42:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 43:
                  if ((0x100000001000000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 45:
                  jjAddStates(0, 1);
                  break;
               case 48:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(49);
                  break;
               case 49:
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(49);
                  break;
               case 51:
                  if (curChar == 114)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 52:
                  if (curChar == 125 && kind > 17)
                     kind = 17;
                  break;
               case 59:
                  jjAddStates(2, 3);
                  break;
               case 61:
               case 62:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(62);
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
               case 45:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 49:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 59:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 63 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   45, 46, 59, 60, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
"\173", "\50", "\51", "\72", null, "\56", null, null, "\52", "\141", null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[63];
private final int[] jjstateSet = new int[126];
protected char curChar;
/** Constructor. */
public QueryParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public QueryParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 63; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
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
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
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

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
