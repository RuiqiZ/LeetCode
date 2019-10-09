import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurrences1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3};
        System.out.print(uniqueOccurrences(arr));

    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> occur = new HashMap<>();

        for (int each: arr) {
            int count = map.containsKey(each)? map.get(each) + 1: 1;
            map.put(each, count);
        }

        for(Map.Entry each: map.entrySet()) {
            int key = (int) each.getValue();
            int value = occur.containsKey(key)? occur.get(key) + 1: 1;
            occur.put(key, value);
        }

        for(Map.Entry each: occur.entrySet()) {
            if ((int)each.getValue() > 1) {
                return false;
            }
        }

        return true;
    }
}
