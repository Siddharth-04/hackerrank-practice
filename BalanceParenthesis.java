import java.util.Stack;

public class BalanceParenthesis {
    public static String isBalanced(String s) {
        // Write your code here

        Stack<Character> stack = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }

            if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){

                if(stack.isEmpty()) return "NO";

                if((s.charAt(i) == ')' && stack.peek() != '(') ||
                        (s.charAt(i) == '}' && stack.peek() != '{') ||
                        (s.charAt(i) == ']' && stack.peek() != '[')
                ) return "NO";

                stack.pop();
            }

        }

        if(!stack.isEmpty()){
            return "NO";
        }

        return "YES";

    }
}
