import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,0,0));
        System.out.println("Input  " + arr);
        System.out.println("Output " + arrange(arr));
    }

    public static List<Integer> arrange(List<Integer> arr) {
        List<Integer> arranged = new ArrayList<>();
        int zeros = 0;
        for (int i: arr) {
            if (i == 0) {
                zeros ++;
            } else {
                arranged.add(i);
            }
        }

        for (int i = 0; i < zeros; i++) {
            arranged.add(arranged.size()/2, 0);
        }

        return arranged;
    }

}
