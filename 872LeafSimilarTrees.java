import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees872 {



    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // retrieve two trees, get the leaf node value, save it, and compare
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        retrieve(root1, list1);
        retrieve(root2, list2);


        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i))
                return false;
        }

        return true;
    }

    public void retrieve(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        retrieve(node.left, list);
        retrieve(node.right, list);
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}

