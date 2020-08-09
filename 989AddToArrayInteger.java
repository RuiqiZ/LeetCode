import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayInteger989 {
    public static void main(String[] args) {
        int[] list = {1};
        int K = 806;
        System.out.println(Arrays.toString(addToArrayForm(list, K).toArray()));
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int remainder;
        int num = 0;
        int carry = K;
        int i = A.length - 1;
        while (i >= 0 || carry >= 10) {

            if (i >= 0) {
                num = A[i] + carry;
            } else {
                num = carry;
            }
            remainder = num % 10;
            list.add(0, remainder);
            carry = (num - remainder) / 10;
            i--;
        }

        if (carry > 0 && carry < 10) {
            list.add(0, carry);
        }

        return list;
    }
}
