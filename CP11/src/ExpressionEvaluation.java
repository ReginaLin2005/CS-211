/* Regina Lin, CS 211, 5/29/2023, ID: 202869488, The following program evaluates validity of the math expression */
import java.util.HashMap;
import java.util.Stack;

public class ExpressionEvaluation {
    // declare variables
    HashMap<Character, Character> pairs = new HashMap<>();
    HashMap<Integer, String> errorMessage = new HashMap<>();
    Stack<Character> stack = new Stack<>();
    boolean valid = true;

    // evaluate validity of expression
    public boolean expressionEvaluation(String mathExpression) {
        loadPairs();
        loadErrorMessage();
        // loop through expression to find matching pairs
        for (int i = 0; i < mathExpression.length(); i++) {
            char c = mathExpression.charAt(i);
            // referenced CP 10
            if (c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == '}') {
                if (stack.isEmpty()) { // account for incomplete expression
                    printError(mathExpression, i, 3);
                    valid = false;
                    break;
                } else if (pairs.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    if (c == ')') {
                        printError(mathExpression, i, 1);
                    } else {
                        printError(mathExpression, i, 2);
                    }
                    valid = false;
                    break;
                }
            }
        }
        // check if all pairs are matched
        if (!stack.isEmpty()) {
            valid = false; 
            printError(mathExpression, mathExpression.length() - 1, 3);
        }
        return valid;
    }
    
    // print errors
    private void printError(String mathExpression, int location, int errorType) {
        System.out.println(mathExpression);
        for (int i = 0; i < location; i++) {
            System.out.print(" ");
        }
        System.out.print("^ ");
        System.out.println(errorMessage.get(errorType));
    }
    
    // use hashmap to match pairs
    public void loadPairs() {
        pairs.put(')', '(');
        pairs.put('}', '{');
    }

    public void loadErrorMessage() {
        errorMessage.put(1, "} expected");
        errorMessage.put(2, ") expected");
        errorMessage.put(3, "Incomplete Expression");
    }
}
