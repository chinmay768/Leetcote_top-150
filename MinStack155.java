import java.util.*;
public class MinStack155 {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> min_stack = new Stack<>();


    public static void push(int val) {
        if(min_stack.isEmpty() || min_stack.peek() >= val){
            min_stack.push(val);
        }
        stack.push(val);
    }

    public static void pop() {
        if(stack.peek().equals(min_stack.peek())){
            min_stack.pop();
        }
        stack.pop();
    }

    public static int top() {
        return stack.peek();
    }

    public static int getMin() {
        return min_stack.peek();
    }

    public static void main(String[] args) {

    }
}
