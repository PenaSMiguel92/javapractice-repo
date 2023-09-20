import java.util.Queue;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> numsQueue = new PriorityQueue<>((a,b) -> {
            if (a < b)
                return 1;
            else if (a > b)
                return -1;
            else
                return 0;
        });
        for (int num : nums) {
            numsQueue.add(num);
        }
        for (int i = 0; i < k-1; i++) {
            numsQueue.poll();
        }
        return numsQueue.poll();
    }
}
