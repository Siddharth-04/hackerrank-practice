import java.util.*;
public class EqualStack {
    static Stack<Integer> buildStackOfList(List<Integer> h){
        Stack<Integer> st = new Stack<>();

        for(int i=h.size()-1 ; i>=0 ; i--){
            st.push(h.get(i));
        }

        return st;
    }

    static int getTotal(List<Integer> h){
        int sum = 0;

        for(int i : h){
            sum += i;
        }

        return sum;
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int sum1 = getTotal(h1);
        int sum2 = getTotal(h2);
        int sum3 = getTotal(h3);

        Stack<Integer> st1 = buildStackOfList(h1);
        Stack<Integer> st2 = buildStackOfList(h2);
        Stack<Integer> st3 = buildStackOfList(h3);



        while (!(sum1 == sum2 && sum2 == sum3)) {
            if (sum1 >= sum2 && sum1 >= sum3 && !st1.isEmpty()) {
                sum1 -= st1.pop();
            } else if (sum2 >= sum1 && sum2 >= sum3 && !st2.isEmpty()) {
                sum2 -= st2.pop();
            } else if (sum3 >= sum1 && sum3 >= sum2 && !st3.isEmpty()) {
                sum3 -= st3.pop();
            }
        }


        return sum1;
    }

}

