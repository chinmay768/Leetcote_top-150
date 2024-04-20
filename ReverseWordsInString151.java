public class ReverseWordsInString151 {

    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        String reverse = "";

        for(int i = words.length - 1; i >= 0; i--){
            reverse += words[i] + " ";
        }

        return reverse.trim();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";

        System.out.println(reverseWords(str));
    }
}
