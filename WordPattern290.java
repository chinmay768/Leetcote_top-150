import java.util.*;
public class WordPattern290 {

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();

        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            boolean containsKey = hm.containsKey(ch);

            if(hm.containsValue(words[i]) && !containsKey){
                return false;
            }

            if(containsKey && !hm.get(ch).equals(words[i])){
                return false;
            }else {
                hm.put(ch, words[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }
}
