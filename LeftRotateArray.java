import java.util.List;

public class LeftRotateArray {
    public static void reverseArr(List<Integer> arr, int start, int end){
        while(start <= end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        reverseArr(arr, 0, d-1);
        reverseArr(arr, d, arr.size()-1);
        reverseArr(arr, 0, arr.size()-1);

        return arr;
    }
}
