import java.util.ArrayList;

public class HourGlass {
    public static int hourGlassSum(ArrayList<ArrayList<Integer>> list){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0 ; i <= 3 ; i++){
            for(int j=0 ; j <= 3 ; j++){
                int sum = 0;

                sum += list.get(i).get(j);
                sum += list.get(i).get(j+1);
                sum += list.get(i).get(j+2);

                sum += list.get(i+1).get(j+1);

                sum += list.get(i+2).get(j);
                sum += list.get(i+2).get(j+1);
                sum += list.get(i+2).get(j+2);

                maxSum = Math.max(sum,maxSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Input list
        System.out.println(hourGlassSum(list));
    }
}
