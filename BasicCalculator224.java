import java.util.*;
public class BasicCalculator224 {

    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] sArray = s.toCharArray();

        int number = 0;
        int result = 0;
        int sign = 1;

        for(int i = 0; i < sArray.length; i++){
            if(Character.isDigit(sArray[i])){
                number = (number * 10 ) + (sArray[i] - '0');
            }else if(sArray[i] == '+'){
                result += (number * sign);
                number = 0;
                sign = 1;
            }else if(sArray[i] == '-'){
                result += (number * sign);
                number = 0;
                sign = -1;
            }else if(sArray[i] == '('){
                stack.push(result);
                stack.push(sign);
                result = 0;
                number = 0;
                sign = 1;
            }else if(sArray[i] == ')') {
                result += (number * sign);
                number = 0;

                int stackSign = stack.peek(); stack.pop();
                int lastResult = stack.peek(); stack.pop();

                result *= stackSign;
                result += lastResult;
            }
        }
        result += number * sign;
        return result;
    }

    public static void main(String[] args) {
        String s = "1 + 1";

        System.out.println(calculate(s));
    }
}
