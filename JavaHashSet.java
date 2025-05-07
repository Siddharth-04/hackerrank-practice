import java.io.*;
import java.util.*;

public class JavaHashSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();

        for(int i=0 ; i<n ; i++){
            String line1 = sc.next();
            String line2 = sc.next();

            String newString = line1 + " " + line2;

            if(!set.contains(line2 + " " + line1)){
                set.add(newString);
            }

            System.out.println(set.size());
        }

    }
}
