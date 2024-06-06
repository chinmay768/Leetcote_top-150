
import java.util.*;
public class GroupAnagrams49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();

        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(str);
        }

        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }
}
