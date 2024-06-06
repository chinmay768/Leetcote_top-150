import java.util.*;

public class LongestConsecutiveSequence128 {

    public static int LongestConsecutiveNaive(int[] arr){
        int maxSize = 0;
        for(int i = 0; i < arr.length; i++){
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            int curr = arr[i];
            boolean next = true;
            while(next){
                next = false;
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] == curr + 1){
                        curr = arr[j];
                        list.add(arr[j]);
                        next = true;
                        break;
                    }
                }
            }
            if(maxSize < list.size())
                maxSize = list.size();
        }

        return maxSize;
    }

    public static int longestConsecutiveSorting(int[] nums) {
        int maxSize = 0;
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == min + 1){
                list.add(nums[i]);
                min = nums[i];

            }else{
                list.clear();
                min = nums[i];
                list.add(nums[i]);
            }

            if(maxSize < list.size())
                maxSize = list.size();
        }

        return maxSize;
    }

    public static int longestConsecutive(int[] nums) {
        int maxSize = 0;
        Map<Integer, Boolean> map = new HashMap<>();

        for(int num : nums){
            map.put(num, Boolean.FALSE);
        }

        for(int num : nums){
            int currLen = 1;
            int nextNum = num + 1;

            while(map.containsKey(nextNum) && map.get(nextNum) == false){
                currLen++;
                map.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            int prevNum = num - 1;

            while(map.containsKey(prevNum) && !map.get(prevNum)){
                currLen++;
                map.put(prevNum, Boolean.TRUE);
                prevNum--;
            }

            maxSize = Math.max(maxSize, currLen);
        }

        return maxSize;
    }



    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }
}
