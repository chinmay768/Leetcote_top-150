import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters3 {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet();

        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, set.size());
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
