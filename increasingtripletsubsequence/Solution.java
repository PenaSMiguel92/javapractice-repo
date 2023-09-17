public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < nums.length; k++) {
            if ((i < j) && (j < k) && (nums[i] < nums[j]) && (nums[j] < nums[k]))
                return true;

            if ((i == j) && (nums[k] > nums[j]))
                j = k;

            if ((nums[j] > nums[i]))
                i = Math.min(i, j);
            else
                i = j;
                
            
        }
        
        return false;
    }
}
