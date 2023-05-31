/* Regina Lin, CS 211, 5/29/2023, ID: 202869488, The following program evaluates the postfix of the math expression */
import java.util.Stack;

public class PostfixEvaluation {
    int result;
    public int postfixEvaluation(String postfix) {
        // declare variables
        
        int result = 0;
        String number = "";
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char token = postfix.charAt(i);
            // check if token is a number
            if (Character.isDigit(token)) {
                // handle single and multi digit numbers
                if (i != 0 && (Character.isDigit((postfix.charAt(i+1))) || Character.isDigit((postfix.charAt(i-1))))) {
                    number = number + token;
                } else if (i == 0 && Character.isDigit((postfix.charAt(i+1)))) {
                    number = number + token;
                }
                else {
                    stack.push((int)(token - '0'));
                }
            } else if (token == ' ' && !number.isEmpty()) {
                // push multi digit number if applicable
                stack.push(Integer.parseInt(number));
                number = ""; // reset number string
            } else if (token != ' ') { // handle operands
                int value1 = stack.pop();
                int value2 = stack.pop();
                // mathematical logic
                if (token == '+') {
                    result = value2 + value1;
                    stack.push(result);
                } else if (token == '-') {
                    result = value2 - value1;
                    stack.push(result);
                } else if (token == '*') {
                    result = value2 * value1;
                    stack.push(result);
                } else {
                    result = value2 / value1;
                    stack.push(result);
                }
            }
        }
        result = stack.pop(); // record final result
        return result;
    }
}
