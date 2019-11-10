/*
    function permute(s)
        if s is an empty string: nothing to do
        else:
            //handle all choices for a single letter; let recursion do the rest
            for each character c in s:
                choose c to be first
                permute(the rest of s)  //explore the remaining chars
                un-choose c

 */

public class Permutation {
    public static void main(String[] args) {
        permute("ABC");
    }

    public static void indent(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("    ");
        }
    }

    public static void permuteHepler(String s, String chosen) {
//        indent(chosen.length());
        System.out.print("\npermuteHelper(\"" + s + "\", \"" +  chosen+ "\")");

        //  if/else
        if (s.isEmpty()) {
            System.out.println(chosen);
        } else {
            // choose/explore/unchoose
            // (1 letter)
            for (int i = 0; i < s.length(); i++) {
                // choose
                char c = s.charAt(i);
                chosen += c;
                s = new StringBuilder(s).deleteCharAt(i).toString();

                // explore
                permuteHepler(s, chosen);

                // un-choose
                s = s.substring(0, i) + c + s.substring(i);
                chosen = chosen.substring(0, chosen.length() - 1);
            }

        }
    }

    public static void permute(String s) {
        permuteHepler(s, "");
    }
}
