/* Regina Lin, CS 211, 5/29/2023, ID: 202869488, The following program convert the math expression into postfix expression */
import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {
    public static HashMap<Character, Integer> precedence = new HashMap<>();

    public static void loadPrecedence(){
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('(', 0);
        precedence.put('{', 0);
    }
    
    public String infix2postfix(String infix) {
        String post = "";
        loadPrecedence();
        Stack<Character> stack = new Stack<Character>(); 
        for (int i = 0; i < infix.length(); i++) { // loop through infix expression
            // System.out.println("starting operand: " + stack);
            char c = infix.charAt(i); // find character at i
            if (Character.isDigit(c)) { // add to postfix if it's a number
                if (i != 0) {
                    if (!Character.isDigit(infix.charAt(i-1))) post += " ";
            }    
            post += c; 
            } else if (c != ' ') { // evaluate precedence if it's an operand
                if (stack.isEmpty() || c == '(') { // push to stack if it's empty
                    stack.push(c);
                } else if (c != ')') { // if not empty, check if it's a closing parenthese
                    if (precedence.get(c) > precedence.get(stack.peek())) {
                        stack.push(c);
                    } else if (precedence.get(c) <= precedence.get(stack.peek())) { // if precedence is lower than existing operands in stack
                        while (!stack.isEmpty() && precedence.get(c) <= precedence.get(stack.peek())) {
                            post += " ";
                            post += stack.pop();
                        }
                        stack.push(c);
                    } 
                } else { // if it is a closing parenthese, pop everything & add operands into postfix expression
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        post += " ";
                        post += stack.pop();
                    }
                    stack.pop();
                }
            }
            // System.out.println("ending operand: " + stack);
        }
    
        while (!stack.isEmpty()) {
            post += " ";
            post += stack.pop();
        }
        return post;
    }
}
