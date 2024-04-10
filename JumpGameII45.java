public class JumpGameII45 {
    public static int jump(int[] nums) {
        int maxReach = 0;
        int jumps = 0;
        int currReach = 0;

        for(int i = 0; i < nums.length - 1; i++){
            maxReach = Math.max(maxReach, i + nums[i]);

            if(i == currReach){
                jumps++;
                currReach = maxReach;
            }
        }

        return jumps;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        System.out.println(jump(nums));
    }
}
