public class SquaresOfSortedArray977 {

    public static void main(String[] args) {
        int[] array = {-4,0};
        int[] result = sortedSquares(array);
        for(int each: result) {
            System.out.print(each + " ");
        }
    }

    public static int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        if (A.length == 1) {
            result[0] = A[0]*A[0];
            return result;
        }

        int midPos = 0;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i+1] >= 0 && A[i] < 0) {
                midPos = i;
            }
        }

        int left = midPos;
        int right = midPos+1;
        int index = 0;
        while (left >=0 && right< A.length) {
            if (A[left]*A[left] > A[right]*A[right]) {
                result[index] = A[right]*A[right];
                right++;
            } else {
                result[index] = A[left]*A[left];
                left--;
            }
            index++;
        }

        while (left >= 0) {
            result[index] = A[left]*A[left];
            left --;
            index ++;
        }

        while (right < A.length) {
            result[index] = A[right]*A[right];
            right ++;
            index ++;
        }
        return result;
    }
}
