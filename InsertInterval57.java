import java.util.*;
public class InsertInterval57 {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for(int[] in : intervals){
            if(in[1] < newInterval[0]){
                res.add(in);
            }else if(in[0] > newInterval[1]){
                res.add(newInterval);
                newInterval = in;
            }else {
                newInterval[0] = Math.min(in[0], newInterval[0]);
                newInterval[1] = Math.max(in[1], newInterval[1]);
            }
        }

        res.add(newInterval);

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};

        int[] newInterval = {2, 5};

        System.out.println(insert(intervals, newInterval));
    }
}
