public class HIndex274 {

    public static int hIndex(int[] citations) {
        int hIdx = 0;
        int[] auxArr = new int[citations.length + 1];

        for(int i = 0; i < citations.length; i++){
            if(citations[i] <= citations.length){
                auxArr[citations[i]]++;
            }else {
                auxArr[citations.length]++;
            }
        }

        int count = 0;
        for(int i = auxArr.length - 1; i >= 0; i--){
            count += auxArr[i];
            if(count >= i){
                return i;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
}
