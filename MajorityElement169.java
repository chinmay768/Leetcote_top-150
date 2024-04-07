public class MajorityElement169 {

    // public static int majorityElement(int[] nums) {
    //     HashMap<Integer, Integer> frequencyMap = new HashMap();

    //     for(int i = 0; i < nums.length; i++){
    //         if(frequencyMap.containsKey(nums[i])){
    //             frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
    //         }else{
    //             frequencyMap.put(nums[i], 1);
    //         }
    //     }

    //     for(Map.Entry<Integer, Integer> elm :frequencyMap.entrySet()){
    //         if(elm.getValue() > nums.length / 2){
    //             return elm.getKey();
    //         }
    //     }

    //     return -1;
    // }

    public static int majorityElement(int[] nums) {
        // Boyer Moore Algorithm
        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }

        return candidate;
    }


    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
}
