import java.util.ArrayList;
import java.util.List;

public class HammingDistance461 {
    public static int HammingDistance461(int x, int y) {
        int bitwise = (x^y);
        int count = 0;

        while (bitwise > 0) {
            count += bitwise & 1;
            bitwise >>= 1;
        }
        return count;
    }
}
