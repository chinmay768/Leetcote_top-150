public class RemoveDuplicatesFromSortedArrayII80 {

    public static int removeDuplicates(int[] nums) {

        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < 2 || nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        System.out.println(removeDuplicates(nums));
    }
}
