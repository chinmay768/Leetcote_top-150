import com.sun.tools.jconsole.JConsoleContext;

import java.util.Arrays;

public class Candy135 {
    public static int candy(int[] ratings) {
        int[] candyCountArr = new int[ratings.length];
        int minCandies = 0;

        Arrays.fill(candyCountArr, 1);

        for(int i = 0; i < ratings.length; i++){
            if(i != 0){
                if(ratings[i] > ratings[i - 1] && candyCountArr[i] <= candyCountArr[i - 1]){
                    candyCountArr[i] =  candyCountArr[i - 1] + 1;
                }
            }


            if(i != ratings.length - 1){
                if(ratings[i] > ratings[i + 1] && candyCountArr[i] <= candyCountArr[i + 1]){
                    candyCountArr[i] = candyCountArr[i + 1] + 1;
                }
            }
        }


        for(int i = ratings.length - 1; i >= 0; i--){
            if(i != 0){
                if(ratings[i] > ratings[i - 1] && candyCountArr[i] <= candyCountArr[i - 1]){
                    candyCountArr[i] =  candyCountArr[i - 1] + 1;
                }
            }


            if(i != ratings.length - 1){
                if(ratings[i] > ratings[i + 1] && candyCountArr[i] <= candyCountArr[i + 1]){
                    candyCountArr[i] = candyCountArr[i + 1] + 1;
                }
            }
        }


        for(int i = 0; i < candyCountArr.length; i++){
            minCandies += candyCountArr[i];
        }


        return minCandies;
    }

    public static int candy2(int[] ratings){
        int[] ans = new int[ratings.length];
        Arrays.fill(ans, 1);

        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i - 1]){
                ans[i] = ans[i - 1] + 1;
            }
        }

        for(int i = ratings.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1] && ans[i] <= ans[i + 1]){
                ans[i] = ans[i + 1] + 1;
            }
        }

        return Arrays.stream(ans).sum();
    }
    public static void main(String[] args) {
        int[] ratings = {1,6,10,8,7,3,2};

        System.out.println(candy2(ratings));
    }
}
