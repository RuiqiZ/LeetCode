import java.util.*;

public class IntersectionOfThreeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,8};
        int[] arr2 = {1,2,5,6};
        int[] arr3 = {1,4,5,8};
        List<Integer> list = arraysIntersection(arr1, arr2, arr3);
        System.out.print(Arrays.toString(list.toArray()));
    }

    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        insert(arr1, map);
        insert(arr2, map);
        insert(arr3, map);

        for (Map.Entry each: map.entrySet()) {
            if((int)each.getValue() == 3) {
                result.add((int)each.getKey());
            }
        }

        Collections.sort(result);

        return result;
    }

    public static void insert(int[] keys, HashMap<Integer, Integer> map) {
        for (int key: keys) {
            int count = map.containsKey(key)? map.get(key) + 1 : 1;
            map.put(key, count);
        }

    }
}
