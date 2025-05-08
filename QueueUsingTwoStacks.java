import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void push(Stack<Integer> stack1,int ele){
        stack1.push(ele);
    }

    static int pop(){

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int top = stack1.pop();
                stack2.push(top);
            }
        }

        return stack2.pop();
    }

    static int peek(){

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int top = stack1.pop();
                stack2.push(top);
            }
        }

        return stack2.peek();
    }

    public static void main(String[] args) {



        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();

            if(a == 1){
                int b = sc.nextInt();
                push(stack1, b);
            }

            else if(a == 2){
                pop();
            }

            else{
                System.out.println(peek());
            }
        }
    }
}
