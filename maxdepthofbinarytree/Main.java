public class Main {
    public static void main(String[] args) {
        TreeNode root1 = TreeNode.generateTreeFromArray(new String[] { "3", "9", "20", "null", "null", "15", "7" });
        TreeNode root2 = TreeNode.generateTreeFromArray(new String[] { "1", "null", "2" });
        Solution sol = new Solution();
        System.out.println(sol.maxDepth(root1));
        System.out.println(sol.maxDepth(root2));
    }
} 
