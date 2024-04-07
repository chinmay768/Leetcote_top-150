import java.util.Arrays;

public class MergeSortedArray88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n -1;
        int k = m + n - 1;

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;

        while(i < m + j && j < n){
            if(nums2[j] < nums1[i]){
                rightShift(nums1, i);
                nums1[i] = nums2[j];
                j++;
            }
            i++;
        }

        while(j < n){
            nums1[i] = nums2[j];
            i++;j++;
        }
    }


    static void rightShift(int[] nums, int startIdx){
        int currIdx = startIdx;
        int lastVal = nums[currIdx];
        while(currIdx < nums.length - 1){
            int temp = nums[currIdx + 1];
            nums[currIdx + 1] = lastVal;
            lastVal = temp;
            currIdx++;
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;

        int[] nums2 = {2,5,6};
        int n = 3;

//        merge2(nums1, m, nums2, n);
        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
