public class ValidAnagram242 {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] charCounts = new int[26];
        for(int i = 0; i < s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for(int count : charCounts){
            if(count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] main){
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }
}
