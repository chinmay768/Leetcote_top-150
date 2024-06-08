import java.util.*;
public class MinArrowsToBurst452 {

    public static void printNestedArr(int[][] arr){
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("/n");
        }
    }

    public static int findMinArrowShots(int[][] points) {
        int n = points.length;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        printNestedArr(points);

        int[] prev = points[0];

        int count = 1;

        for(int i = 1; i < points.length; i++){
            int currStartPoint = points[i][0];
            int currEndPoint = points[i][1];

            int prevStartPoint = prev[0];
            int prevEndPoint =  prev[1];

            if(currStartPoint > prevEndPoint){
                count++;
                prev = points[i];
            }else {
                prev[0] = Math.max(prevStartPoint, currStartPoint);
                prev[1] = Math.min(prevEndPoint, currEndPoint);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] points = {{-2147483646,-2147483645},{2147483646,2147483647}};

        System.out.println(findMinArrowShots(points));
    }
}
