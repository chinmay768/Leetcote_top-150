public class ValidPalindrome125 {

    public static boolean isPalindrome(String s) {
        String finalString = "";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                finalString += c;
            }
        }

        finalString = finalString.toLowerCase();

        int start = 0;
        int end = finalString.length() - 1;

        while(start < end){
            if(finalString.charAt(start) != finalString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome((str)));
    }
}
