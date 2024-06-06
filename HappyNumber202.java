import java.util.*;
public class HappyNumber202 {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(true){
            int sum = 0;
            while(n != 0){
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }

            if(sum == 1) return true;

            n = sum;

            if(set.contains(sum))
                return false;
            else
                set.add(sum);
        }
    }

    public static void main(String[] args) {
        int n = 19;

        System.out.println(isHappy(n));
    }
}
