public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length < 2)
            return 0;

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            rightSum[i] = (i + 1) < nums.length ? nums[i + 1] + rightSum[i+1] : 0;
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = (i - 1) >= 0 ? nums[i - 1] + leftSum[i - 1] : 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum[i] == rightSum[i])
                return i;
        }

        return -1;
    }
}
