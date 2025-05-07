import java.util.HashMap;
import java.util.List;

public class RansomeNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        HashMap<String,Integer> map = new HashMap<>();

        for(String s:magazine){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String s:note){
            if(!map.containsKey(s) || map.get(s) == 0){
                System.out.println("No");
                return;
            }

            map.put(s, map.get(s)-1);
        }

        System.out.println("Yes");
    }
}
