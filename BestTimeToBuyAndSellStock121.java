import java.util.Arrays;

public class BestTimeToBuyAndSellStock121 {
    // public int maxProfit(int[] prices) {
    //     int maxProfit = Integer.MIN_VALUE;
    //     for(int i = 0; i < prices.length; i++){
    //         for(int j = i; j < prices.length; j++){
    //             int currProfit = prices[j] - prices[i];
    //             if(currProfit > maxProfit){
    //                 maxProfit = currProfit;
    //             }
    //         }
    //     }
    //     return maxProfit;
    // }


//    public static int maxProfit(int[] prices) {
//        int[] auxArr = new int[prices.length];
//
//        int maxFromLast = Integer.MIN_VALUE;
//        for(int i = prices.length - 1; i >= 0; i--){
//            if(maxFromLast < prices[i]){
//                maxFromLast = prices[i];
//            }
//            auxArr[i] = maxFromLast;
//        }
//
//        int maxProfit = Integer.MIN_VALUE;
//        for(int i = 0; i < prices.length; i++){
//            if(maxProfit < (auxArr[i] - prices[i])){
//                maxProfit = auxArr[i] - prices[i];
//            }
//        }
//        System.out.println(Arrays.toString(auxArr));
//
//        return maxProfit;
//    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];

        for(int price : prices){
            if(price < min){
                min = price;
            }

            maxProfit = Math.max(maxProfit, price - min);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {1, 2, 4};

        System.out.println(maxProfit(prices));
    }
}
