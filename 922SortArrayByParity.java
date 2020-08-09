import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SortArrayByParity922 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2};
        arr = sortArrayByParityII(arr);
        for (int each: arr) {
            System.out.print(each + " ");
        }
    }

    public static int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        List<Integer> list = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int each: A) {
            if (0 == each%2 ) {
                even.add(each);
            } else {
                odd.add(each);
            }
        }

        for (int i = 0; i < odd.size(); i++) {
            list.add(even.get(i));
            list.add(odd.get(i));
        }

        for (int i = 0; i < A.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
