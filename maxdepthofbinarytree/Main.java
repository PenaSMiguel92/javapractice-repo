public class Main {
    public static void main(String[] args) {
        TreeNode root1 = TreeNode.generateTreeFromArray(new String[] { "3", "9", "20", "null", "null", "15", "7" });
        System.out.println(root1);
        TreeNode root2 = TreeNode.generateTreeFromArray(new String[] { "1", "null", "2" });
        System.out.println(root2);
    }
} 
