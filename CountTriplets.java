import java.util.HashMap;
import java.util.List;

public class CountTriplets {
    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long,Long> left = new  HashMap<>();
        HashMap<Long,Long> right = new  HashMap<>();

        long triplets = 0;

        for(Long i : arr){
            right.put(i,right.getOrDefault(i, (long)0)+(long)1);
        }

        for(int i=0 ; i<arr.size() ; i++){
            right.put(arr.get(i),right.get(arr.get(i))-(long)1);

            long lCount = arr.get(i)/r;
            long rCount = arr.get(i)*r;

            if(arr.get(i)%r==0 && right.containsKey(rCount) && left.containsKey(lCount)){
                triplets += left.get(lCount) * right.get(rCount);
            }

            left.put(arr.get(i),left.getOrDefault(arr.get(i), (long)0)+1);
        }

        return triplets;
    }
}
