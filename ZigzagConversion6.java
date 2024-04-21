public class ZigzagConversion6 {

    public static String convert(String s, int numRows) {
        String[] rows = new String[numRows];
        for(int i = 0; i < numRows; i++){
            rows[i] = "";
        }

        int i = 0;

        while(i < s.length()){
            for(int index = 0; index < numRows && i < s.length(); index++){
                rows[index] += s.charAt(i++);
            }

            for(int index = numRows - 2; index > 0 && i < s.length(); index--){
                rows[index] += s.charAt(i++);
            }
        }

        String res = "";
        for(String str : rows){
            res += str;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        System.out.println(convert(str, 3));
    }
}
