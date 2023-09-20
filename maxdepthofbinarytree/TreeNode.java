public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override 
    public String toString() {
        String val = "[";
        val += getValRecursively(this);
        val += "]";
        return val;
    }

    public String getValRecursively(TreeNode root) {
        if (root == null)
            return "null";

        String val = Integer.toString(root.val) + "," + getValRecursively(root.left) + ","
                + getValRecursively(root.right);
        return val;
    }
    
    public static TreeNode generateTreeFromArray(String[] nums) {
        if (nums[0] == "null")
            return null;

        int rootVal = Integer.parseInt(nums[0]);
        TreeNode rootNode = new TreeNode(rootVal);
        TreeNode pointerNode = rootNode;
        int left = 1;
        int right = 2;
        /*while (left < nums.length || right < nums.length) {
            pointerNode.left = new TreeNode(nums[left]);
            pointerNode.right = new TreeNode(nums[right]);
        
            left = left < nums.length ? left + 2 : left;
            right = right < nums.length ? right + 2 : right;
        }*/
        generateNodes(pointerNode, left, right, nums);
        return rootNode;
    }
    
    private static void generateNodes(TreeNode currentNode, int left, int right, String[] nums) {
        if (currentNode == null)
            return;
        if (left >= nums.length || right >= nums.length)
            return;
        
        currentNode.left = nums[left] == "null" ? null : new TreeNode(Integer.parseInt(nums[left]));
        currentNode.right = nums[right] == "null" ? null : new TreeNode(Integer.parseInt(nums[right]));
        
        generateNodes(currentNode.left, left+2, right+2, nums);
        generateNodes(currentNode.right, left+4, right+4, nums);
    }
    

} 
