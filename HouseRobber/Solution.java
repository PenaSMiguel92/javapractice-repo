import java.util.Map;
import java.util.HashMap;

public class Solution {
    Map<Integer, Integer> DP = new HashMap<>();

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        DP.put(0, nums[0]);
        DP.put(1, nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (i - 3 >= 0) {
                DP.put(i, Math.max(DP.get(i - 2), DP.get(i - 3)) + nums[i]);
            } else {
                DP.put(i, DP.get(i - 2) + nums[i]);
            }
        }

        return Math.max(DP.get(nums.length - 2), DP.get(nums.length - 1));
    }   
}
