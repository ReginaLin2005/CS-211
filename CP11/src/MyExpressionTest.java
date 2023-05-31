/* Regina Lin, CS 211, 5/29/2023, ID: 202869488, The following program evaluates validity of the math expression, convert it into
 * postfix expression, and evaluates the final postfix expression
 */
import java.util.Scanner;

public class MyExpressionTest {
    static Scanner input = new Scanner(System.in);
    static String infix;
    static String postfix;
    static String mathExpression = "";
    static boolean valid;
    public static void main(String[] args) {
        while (true) {
            System.out.printf("\nEnter a math expression: ");
            mathExpression=input.nextLine();
            if (mathExpression.length()==0) {
                System.out.printf("\nBye!");
                break;
            }
            else {
                ExpressionEvaluation ee = new ExpressionEvaluation();
                valid = ee.expressionEvaluation(mathExpression);
                if (valid) {
                    System.out.println("Infix: " + mathExpression);
                    InfixToPostfix i2p = new InfixToPostfix();
                    String postfix = i2p.infix2postfix(mathExpression);
                    System.out.println("Postfix: " + postfix);
                    PostfixEvaluation pe = new PostfixEvaluation();
                    int result = pe.postfixEvaluation(postfix);
                    System.out.println("Result: " + result);
                } // end if (valid)
            } // end else
        } // end while
            
    }
}
