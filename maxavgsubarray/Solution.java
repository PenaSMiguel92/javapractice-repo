public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];

        double maxAvg = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, sum);
        }
        return maxAvg/k;
    }
}
