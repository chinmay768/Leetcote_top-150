public class LengthOfLastWord58 {

    public static int lengthOfLastWord(String s) {
        String trimmedStr = s.trim();
        String[] wordsArr = trimmedStr.split(" ");
        String lastWord = wordsArr[wordsArr.length - 1];

        return lastWord.length();
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
