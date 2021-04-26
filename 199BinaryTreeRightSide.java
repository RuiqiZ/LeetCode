class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        loop(root, list, 0);
        return list;
    }
    
    private void loop (TreeNode node, List<Integer> list, int level) {
        if (node == null) {
            return;
        }    
        
        if (list.size() == level) {
            list.add(node.val);
        }
        
        loop(node.right, list, level+1);
        loop(node.left, list, level+1);
    }
}