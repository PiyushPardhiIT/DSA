//20. Valid Parentheses
import java.util.Stack;

public class TwentyThree {
    public static void main(String[] args){
        String s = "()[]{}";        
        boolean result= new TwentyThree().isValid(s);
        System.err.println(result);
    }
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            // Opening brackets
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {

                // If closing bracket appears first
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching
                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        // Stack should be empty at end
        return stack.isEmpty();
    }    
}
