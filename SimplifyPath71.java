import java.util.*;
public class SimplifyPath71 {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] strArr = path.split("/");

        for(String st : strArr){
            if(st.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!st.equals("") && !st.equals(".") && !st.equals("..")){
                stack.push(st);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String s : stack){
            sb.append("/");
            sb.append(s);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        String path = "/home/";

        System.out.println(simplifyPath(path));
    }
}
