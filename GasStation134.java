public class GasStation134 {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalDiff = 0;
        int fuel = 0;
        int index = 0;

        for(int i = 0; i < gas.length; i++){
            int diff = gas[i] - cost[i];
            totalDiff += diff;

            fuel += diff;
            if(fuel < 0){
                index = i + 1;
                fuel = 0;
            }
        }

        return (totalDiff < 0)? -1 : index;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas, cost));
    }
}
