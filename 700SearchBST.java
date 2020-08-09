public class SearchBST700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        else
            return search(root, val);

    }

    public TreeNode search(TreeNode node, int val) {
        if (node == null)
            return null;
        else if (node.val == val)
            return node;
        else {
            if (val >= node.val)
                return search(node.right, val);
            else
                return search(node.left, val);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
