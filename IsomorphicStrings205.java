import java.util.*;
public class IsomorphicStrings205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original, replacement);
                }else {
                    return false;
                }
            }else{
                char mappedCharacter = map.get(original);
                if(mappedCharacter != replacement){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
    }

}
