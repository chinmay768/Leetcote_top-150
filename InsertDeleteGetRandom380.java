import java.util.*;
public class InsertDeleteGetRandom380 {
    List<Integer> list;
    HashMap<Integer, Integer> map;
    Random random;

    public  InsertDeleteGetRandom380() {
        list = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }

        int pos = map.get(val);
        if(pos != list.size() - 1){
            int lastElm = list.get(list.size() - 1);
            list.set(pos, lastElm);
            map.put(lastElm, pos);
        }

        map.remove(val);
        list.remove(list.size() - 1);

        return true;

    }

    public int getRandom() {
        int randIdx = random.nextInt(list.size());
        return list.get(randIdx);
    }

    public static void main(String[] args) {
        InsertDeleteGetRandom380 obj = new InsertDeleteGetRandom380();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.insert(2);
        boolean param_3 = obj.remove(1);
        int param_4 = obj.getRandom();
        System.out.println(param_1 +" " + param_2 + " " + param_3 + " " + param_4);
    }
}
