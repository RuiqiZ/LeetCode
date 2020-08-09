import java.util.HashMap;
import java.util.Map;

public class LongestSubstring003 {
    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        Map<Character, Integer> h = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (h.containsKey(s.charAt(i))) {
                j = Math.max(j, h.get(s.charAt(i)) + 1);
            }
            h.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);

        }
        return max;
    }
}
