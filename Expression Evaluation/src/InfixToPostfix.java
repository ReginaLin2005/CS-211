import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {
    public static String post = "";
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
        loadPrecedence();
        Stack<Character> stack = new Stack<Character>();
        return post;
    }
}
