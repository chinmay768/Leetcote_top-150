public class RemoveDuplicatesFromSortedArray26 {

    public static int removeDuplicates(int[] nums) {
        int k = 0;

        for(int i = 0; i < nums.length - 1;  i++){
            if(nums[i] != nums[i + 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[nums.length - 1];
        k++;

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }
}
