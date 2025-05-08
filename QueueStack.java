import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueStack {
    public void checkPalindrome(){
        Queue<Character> q = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=0 ; i<s.length() ;  i++){
            stack.push(s.charAt(i));
            q.add(s.charAt(i));
        }

        for(int i=0 ; i<s.length() ; i++){
            if(stack.pop() != q.poll()){
                System.out.print("The word, " + s + ", is not a palindrome.");
                return;
            }
        }

        System.out.print("The word, " + s + ", is a palindrome.");

        sc.close();
    }
}

