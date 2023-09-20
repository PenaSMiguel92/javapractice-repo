public class Solution {

    public int maxDepth(TreeNode root) {
        
        return depthCount(0, root);
    }

    public int depthCount(int current, TreeNode root) {
        if (root == null)
            return current;
        current++;
        current = Math.max(depthCount(current, root.left), depthCount(current, root.right));
        return current;
    }
} 
