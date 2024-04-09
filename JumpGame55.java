public class JumpGame55 {

    public static boolean canJump(int[] nums) {
        int reachableIdx = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > reachableIdx)
                return false;

            reachableIdx = Math.max(reachableIdx, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};

        System.out.println(canJump(arr));
    }
}
