public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1, hi = -1;
        for (int i : piles) {
            hi = Math.max(i, hi);
        }
        while (lo < hi) {
            int m = lo + (hi - lo) / 2;
            int hrs = 0;
            for (int amount : piles) {
                if (amount % m == 0) {
                    hrs += amount / m;
                } else {
                    hrs += amount / m + 1;
                }
            }
            if (hrs > h)
                lo = m + 1;
            else 
                hi = m;
        }
        return lo;
    }
}
