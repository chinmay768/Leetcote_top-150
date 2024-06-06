import java.util.*;

public class TwoSum1 {
     public static int[] twoSumNaive(int[] nums, int target) {
         for(int i = 0; i < nums.length; i++){
             for(int j = i + 1; j < nums.length; j++){
                 int complement = target - nums[i];

                 if(nums[j] == complement){
                     return new int[] {i, j};
                 }
             }
         }

         throw new IllegalArgumentException("no match found");
     }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 18;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
