import java.util.HashMap;
import java.util.Stack;

public class ExpressionEvaluation {
    // declare variables
    HashMap<Character, Character> pairs = new HashMap<>();
    Stack<Character> stack = new Stack<>();
    boolean valid = true;

    public boolean expressionEvaluation(String mathExpression) {
        loadPairs();
        // loop through expression to find matching pairs
        for (int i = 0; i < mathExpression.length(); i++) {
            char c = mathExpression.charAt(i);
            if (c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == '}') {
                if (stack.isEmpty()) {
                    printError(1);
                    valid = false;
                } else if (pairs.get(c) == stack.peek()) {
                    stack.pop();
                }
            }
        }
        // check if all pairs are matched
        if (!stack.isEmpty()) valid = false;
        return valid;
    }

    private void printError(int errorType) {
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
        }

    }
    
    public void loadPairs() {
        pairs.put(')', '(');
        pairs.put('}', '{');
    }
}
