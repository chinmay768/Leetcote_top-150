import java.util.Arrays;

public class RotateArray189 {

    public static void rotate(int[] nums, int k) {


        // while(k > nums.length){ // If K is greater than the length of nums
        //     k = k - nums.length;
        // }

        // k = k % nums.length;

        // reverse(nums, 0, nums.length - 1);
        // reverse(nums, 0, k-1);
        // reverse(nums, k, nums.length - 1);

        int[] temp = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int targetIdx= (i + k) % nums.length;

            temp[targetIdx] = nums[i];
        }

        for(int i = 0;  i < nums.length; i++){
            nums[i] = temp[i];
        }

    }

    public static void reverse(int[] nums, int startIdx, int endIdx){
        while(startIdx <= endIdx){
            int temp = nums[startIdx];
            nums[startIdx] = nums[endIdx];
            nums[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }

    public static void rotateRightByOne(int[] nums){
        int temp = nums[nums.length - 1];

        for(int i = nums.length - 1; i > 0; i--){
            nums[i] = nums[i - 1];
        }

        nums[0] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}
