public class MakingAnagrams {
    public static int makingAnagrams(String s1, String s2) {
        int [] freq = new int[26];
        int sum = 0;

        for(int i=0 ; i<s1.length() ; i++){
            char c = s1.charAt(i);
            freq[c - 'a']++;
        }

        for(int i=0 ; i<s2.length() ; i++){
            char c = s2.charAt(i);
            freq[c - 'a']--;
        }

        for(Integer i : freq){
            sum += Math.abs(i);
        }

        return sum;
    }
}
