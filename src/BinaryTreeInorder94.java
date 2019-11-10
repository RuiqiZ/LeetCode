import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorder94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        driver(root, list);
        return list;
    }

    public void driver(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        driver(node.left, list);
        list.add(node.val);
        driver(node.right, list);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
