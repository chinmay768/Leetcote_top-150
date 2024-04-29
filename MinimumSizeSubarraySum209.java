public class MinimumSizeSubarraySum209 {

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;

        int left = 0;
        int windowSum = 0;

        for(int i = 0; i < nums.length; i++){
            windowSum += nums[i];

            while(windowSum >= target){
                minLen = Math.min(minLen, i + 1 - left);
                windowSum -= nums[left];
                left++;
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
    public static void main(String[] args) {
        int target = 7;

        int[] nums = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(target, nums));
    }
}
