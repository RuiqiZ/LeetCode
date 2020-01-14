//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//        For example:
//        Given binary tree [3,9,20,null,null,15,7],
//         3
//        / \
//        9  20
//           /  \
//          15   7
//        return its level order traversal as:
//        [
//        [3],
//        [9,20],
//        [15,7]
//        ]


import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal102 {
    public static void main(String[] args) {

    }

    public static List list(TreeNode root) {
        List result = new ArrayList();
        if (root != null) {
            orderTraversal(0, root, result);
        }
        return result;
    }

    public static void orderTraversal(int level, TreeNode node, List result) {
        if (level > result.size() - 1)
            result.add(new ArrayList<>());
    }
}
