import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int[] postfixArr = new int[nums.length];
        int[] outputArr= new int[nums.length];

        prefixArr[0] = 1;
        for(int i= 1; i < prefixArr.length; i++){
            prefixArr[i] = prefixArr[i - 1] * nums[i - 1];
        }

        postfixArr[postfixArr.length - 1] = 1;
        for(int i= nums.length - 2; i >= 0; i--){
            postfixArr[i] = postfixArr[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < outputArr.length; i++){
            outputArr[i] = prefixArr[i] * postfixArr[i];
        }

        return outputArr;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
