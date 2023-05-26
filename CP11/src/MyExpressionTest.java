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
                    InfixToPostfix i2p = new InfixToPostfix();
                    String postfix = i2p.infix2postfix(mathExpression);
                    PostfixEvaluation pe = new PostfixEvaluation();
                    int result = pe.postfixEvaluation(postfix);
                } // end if (valid)
            } // end else
        } // end while
            
    }
}
