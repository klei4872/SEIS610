/**
 * Prefix calculator:  generate the expression tree, then display it
 * in the various supported means and finally show the result of the
 * calculation.
 *
 * NOTE:  Specific to Java version 5.0 --- Scanner
 *
 * @author  Timothy Rolfe
 */
import java.util.Scanner;

public class PrefixCalc
{
   public static void main ( String[] args )
   {
      ExpressionTree calc;
      Scanner        console = new Scanner(System.in);

   // Allow for a command-line argument (which would be double-quoted).
      if ( args.length > 0 )
      {
         System.out.println ("Processing string " + args[0]);

         calc = new ExpressionTree(new Scanner(args[0]));
      }
      else
      {
         System.out.println
           ( "Prefix expression, with all elements separated by blanks");

         calc = new ExpressionTree(new Scanner(console.nextLine()));
      }

      System.out.println ("\nInput as prefix expression:");
      calc.showPreFix();

      System.out.println ("\nInput as postfix expression:");
      calc.showPostFix();

      System.out.println ("\nInput as parenthesized infix expression:");
      calc.showInFix();

      System.out.println ("\nValue:  " + calc.evaluate());

      System.out.print ("Press <Enter> to exit:  ");
      console.nextLine();
   }
}
