import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> numsQueue = new PriorityQueue<>(nums.length, (a,b) -> {
            if (a < b)
                return 1;
            if (a > b)
                return -1;
            
            return 0;
        });
        numsQueue.addAll(Arrays.stream(nums).boxed().toList());
        for (int i = 0; i < k-1; i++) {
            numsQueue.poll();
        }
        return numsQueue.poll();
    }
}
