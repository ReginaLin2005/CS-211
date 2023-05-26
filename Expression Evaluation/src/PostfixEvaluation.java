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
                    System.out.println("added new digit " + token + " to number " + number);
                } else if (i == 0 && Character.isDigit((postfix.charAt(i+1)))) {
                    number = number + token;
                    System.out.println("added new digit " + token + " to number " + number);
                }
                else {
                    stack.push((int)(token - '0'));
                    System.out.println("pushed singal digit: " + token);
                }
                System.out.println(stack.toString());
            } else if (token == ' ' && !number.isEmpty()) {
                // push multi digit number if applicable
                stack.push(Integer.parseInt(number));
                System.out.println("pushed multi digit: " + number);
                number = ""; // reset number string
            } else if (token != ' ') {
                int value1 = stack.pop();
                int value2 = stack.pop();
                if (token == '+') {
                    result = value2 + value1;
                    System.out.println(value2 + " + " +  value1 + " = " + result);
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
        result = stack.pop();
        return result;
    }
}
