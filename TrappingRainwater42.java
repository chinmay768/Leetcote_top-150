import java.util.Arrays;

public class TrappingRainwater42 {
    public static int trap(int[] height) {
        int[] res = new int[height.length];
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        for(int i = 0; i < height.length; i++){
            if(i == 0){
                leftMax[i] = height[i];
                continue;
            }
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        for(int i = height.length - 1; i >= 0; i--){
            if(i == height.length - 1){
                rightMax[i] = height[i];
                continue;
            }
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));

        for(int i = 0; i < res.length; i++){
            int storageCapacity = 0;
            if(i == 0 || i == res.length - 1){
                res[i] = storageCapacity;
                continue;
            }

            int minElevation = Math.min(leftMax[i], rightMax[i]);
            System.out.println(minElevation + " " + height[i]);

            if(height[i] < minElevation){
                storageCapacity = minElevation - height[i];
                System.out.println(storageCapacity + " " + i);
            }

            res[i] = storageCapacity;
        }

        return Arrays.stream(res).sum();
    }

    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(heights));
    }
}
