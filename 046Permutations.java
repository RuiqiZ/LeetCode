import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        List<Integer> nums = new ArrayList<>();

        for(int i=0; i< array.length; i++) {
            nums.add(array[i]);
        }

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, list, result);

        result.get(5).forEach(each -> System.out.print(each));
    }

    public static void permuteHelper(List<Integer> nums, List<Integer> list, List<List<Integer>> result) {

        if (nums.isEmpty()) {

            result.add(new ArrayList<>(list));


//            list.forEach(each -> System.out.print(each));
//            System.out.print("\n");
        } else {
            for (int i = 0; i < nums.size(); i++) {
                int num = nums.get(i);
                list.add(num);
                nums.remove(i);

                permuteHelper(nums, list, result);
                list.remove(list.size()-1);
                nums.add(i, num);
            }
        }
    }
}
