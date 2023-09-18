public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int low = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= low)
                low = nums[i];
            else if (nums[i] < mid)
                mid = nums[i];
            else if (nums[i] > mid)
                return true;
        }
        
        return false;
    }
}
