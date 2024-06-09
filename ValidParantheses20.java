import java.util.*;
public class ValidParantheses20 {

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if( ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty())
                    return false;

                char top = stack.pop();
                if(ch == ')' && top != '(')
                    return false;
                else if(ch == ']' && top != '[')
                    return false;
                else if(ch == '}' && top != '{')
                    return false;
            }


        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";

        System.out.println(isValid(s));
    }
}
