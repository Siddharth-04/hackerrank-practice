import java.util.Arrays;
import java.util.Scanner;

public class MeetingOverlap {
    public static boolean checkOverlap(int[][] meetings){
        Arrays.sort(meetings,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });

        for(int i=0 ; i< meetings.length-1 ; i++){
            if(meetings[i][1] > meetings[i+1][0]) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][]meetings = new int[n][2];

        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            meetings[i][0] = a;
            meetings[i][1] = b;
        }

        System.out.println(checkOverlap(meetings));
    }
}
