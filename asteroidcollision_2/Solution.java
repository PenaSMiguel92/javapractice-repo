import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> asteroidDeque = new ArrayDeque<>();
        asteroidDeque.offer(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++) {
            int curVal = asteroids[i];
            if (curVal > 0) {
                asteroidDeque.offer(curVal);
                continue;
            }

            int last = asteroidDeque.peek();
            if (last > 0 && Math.abs(last) <= Math.abs(curVal)) {
                asteroidDeque.pop();
                asteroidDeque.push(curVal);
            } else
                asteroidDeque.push(curVal);
        }
        int n = asteroidDeque.size();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--)
            ans[i] = asteroidDeque.pop();
            
        return ans;
    }
} 
