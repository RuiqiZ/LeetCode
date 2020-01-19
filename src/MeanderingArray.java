import java.util.Arrays;

public class MeanderingArray {
    public static void main(String[] args) {
        int[] nums = {-1,1,2,3,-5};

    }

    public static int[] meanderingOrder(int[] unsorted) {
        if (unsorted == null || unsorted.length == 0)
            return null;

        int length = unsorted.length;
        int[] result = new int[length];
        int index = 0;
        Arrays.sort(unsorted);

        for (int i = 0, j = length - 1; i <= length/2 || j > length/1; i++, j--) {
            if (index < length) {
                result[index] = unsorted[j];
                index++;
            }

            if (index < length) {
                result[index] = unsorted[i];
                index++;
            }
        }

        return result;
    }

}
