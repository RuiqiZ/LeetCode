import java.util.*;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] cars = {"eat","tea","tan","ate","nat","bat"};
        System.out.print(groupAnagrams(cars));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null)
            return new ArrayList<>();

        Map <String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String cs = String.valueOf(chars);

            if (!map.containsKey(cs)) {
                map.put(cs, new ArrayList<>());
            }
            map.get(cs).add(s);

        }
        return new ArrayList<> (map.values());
    }
}
