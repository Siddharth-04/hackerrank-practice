import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static String twoStringsUsingHashSet(String s1, String s2) {
        // Write your code here
        Set<Character> set = new HashSet<>();

        for(int i=0 ; i<s1.length() ; i++){
            set.add(s1.charAt(i));
        }

        for(int i=0 ; i<s2.length() ; i++){
            if(set.contains(s2.charAt(i))){
                return "YES";
            }
        }

        return "NO";
    }

    public static String twoStringsUsingFrequencyArray(String s1, String s2) {
        // Write your code here
        int [] freq = new int[26];

        for(int i=0 ; i<s1.length() ; i++){
            freq[s1.charAt(i)-'a']++;
        }

        for(int i=0 ; i<s2.length() ; i++){
            if(freq[s2.charAt(i)-'a'] > 0){
                return "YES";
            }
        }

        return "NO";
    }
}
