import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExpressionCalculator
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter an expression: ");
      String expression = in.nextLine();
      System.out.println("Result: " + simplify(expression));
   }
   
   /**
      This method simplifies parentheses in an expression
      using recursion.
      @param e the expression
      @return the result in String
   */
   public static String simplify(String e)
   {
      if (!e.contains("(")) { return evaluate(e); }               // special terminating case (when there are no more parentheses)
      int end = e.indexOf(')');                                   // find index of the first ')'
      int start = end - 1;
      while (e.charAt(start) != '(') { start--; }                 // find index of the matching '('
      String subresult = evaluate(e.substring(start + 1, end));   // evaluate inside parenthesis
      return simplify(e.substring(0, start) + subresult + e.substring(end + 1));    // recursive call to continue simplifing the expression
   }
   
   /**
      This method evaluates non-parenthesis expressions
      (including + - * /) from left to right using Queue.
      @param e the expression
      @return the result in String
   */
   public static String evaluate(String e)
   {
      Queue<Integer> q = new LinkedList<>();
      int pos = 0;
      int operand1 = 0;
      while (pos < e.length())
      {
         String next = "";
         if (Character.isDigit(e.charAt(pos)))
         {
            next = nextToken(e, pos);
            operand1 = Integer.parseInt(next);
         }
         else if (e.charAt(pos) == '+')         // because '+' has lower precedence
         {
            q.add(operand1);                    // add the number that comes before '+' to the queue so that they can be evaluated later
            pos++; next = nextToken(e, pos);    // get the next number after '+'
            operand1 = Integer.parseInt(next);  // and store it into operand1
         }
         else if (e.charAt(pos) == '-')         // same as '+' except
         {
            q.add(operand1);
            pos++; next = nextToken(e, pos);
            operand1 = - Integer.parseInt(next);   // operand1 includes the negative sign so that when it is added to queue
         }                                         // queue will be the collection of terms with included signs
         else if (e.charAt(pos) == '*')            // because '*' has higher precedence
         {                                         // they can be evaluated immediately, so we don't need to add the numbers into queue
            pos++; next = nextToken(e, pos);       // get the next number after '*'    
            int operand2 = Integer.parseInt(next); // and store it into operand2
            operand1 = operand1 * operand2;        // evaluate and store the result into operand1
         }
         else                                      // this is '/' case, similiar to '*'
         {
            pos++; next = nextToken(e, pos);
            int operand2 = Integer.parseInt(next);
            operand1 = operand1 / operand2;
         }
         pos = pos + next.length();
      }
      q.add(operand1);                    // after if-else above, there will be a last term stored in operand1 that has not been added to queue
      int result = 0;
      while (q.peek() != null)            // simply add up all elements in queue to get the result
      {                                   // the if-else above evaluates * /, this while loop evaluates + -
         result = result + q.remove();
      }
      return "" + result;
   }
   
   /**
      This method returns the next number in the expression.
      @param e the expression, start starting index
      @return the next number in the expression
   */
   public static String nextToken(String e, int start)
   {
      int end = start + 1;
      while (end < e.length() && Character.isDigit(e.charAt(end))) { end++; }
      return e.substring(start, end);
   }
}