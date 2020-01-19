import java.util.ArrayList;
import java.util.List;

public class MinimumAdjacentSwaps {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,1,0,0};
        System.out.print(swaps(nums));
    }


    public static int swaps(int[] array) {
        if (array.length < 2 || array == null)
            return 0;

        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                pos.add(i);
        }

        int sum = 0;
        for (int i = 0, j = pos.size(); i < pos.size(); i++, j--) {
            sum += array.length - pos.get(i) - j;
        }

        return sum;
    }
}
