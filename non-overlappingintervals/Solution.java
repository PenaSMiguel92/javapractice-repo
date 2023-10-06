import java.util.Arrays;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int[] prev = null;
        for (int[] interval : intervals) {
            if (prev == null) {
                prev = interval;
                continue;
            }
            if (interval[0] >= prev[1])
                prev = interval;
            else if (interval[0] > prev[0] && interval[1] < prev[1]) {
                prev = interval;
                count++;
            } else if (interval[0] < prev[1]) {
                count++;
            }
                
        }
        return count;
    }
}
