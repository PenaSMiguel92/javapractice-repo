public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int exists[] = new int[20_002];
        for (int i : nums) {
            exists[i + 10_000]++;
        }
        int i = exists.length - 1;
        while (k > 0) {
            k -= exists[i];
            i--;
        }
        return ++i - 10_000;
    }
}
