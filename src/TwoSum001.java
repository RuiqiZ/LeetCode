
import java.util.Hashtable;
import java.util.Map;

public class TwoSum001 {
    public static void main(String[] args) {
        int[] nums = {3,2};
        twoSum(nums, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            table.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int theOther = target - nums[i];

            if (table.containsKey(theOther) && table.get(theOther) != i) {
                return new int[] {i, table.get(theOther)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
