import java.util.*;
public class ReversePolishNotation150 {

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        String operators = "+-*/";

        for(String s : tokens){
            if(operators.indexOf(s) != -1){
                int oprnd2 = Integer.parseInt(stack.pop());
                int oprnd1 = Integer.parseInt(stack.pop());
                int res = 0;
                if(s.equals("+")){
                    res = oprnd1 + oprnd2;
                }else if(s.equals("-")){
                    res = oprnd1 - oprnd2;
                }else if(s.equals("*")){
                    res = oprnd1 * oprnd2;
                }else if(s.equals("/")){
                    res = oprnd1 / oprnd2;
                }
                stack.push("" + res);
            }
            else {
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.peek());
    }

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};

        System.out.println(evalRPN(tokens));
    }
}
