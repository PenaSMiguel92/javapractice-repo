import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length < 2)
            return asteroids;

        Stack<Integer> asteroidStack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int curVal = asteroids[i];
            if (curVal > 0) {
                asteroidStack.push(curVal);
                continue;
            }
            boolean survived = true;
            while (asteroidStack.size() > 0) {
                int last = asteroidStack.peek();
                if (last < 0)
                    break;
                if (Math.abs(last) < Math.abs(curVal)) {
                    asteroidStack.pop();
                } else if (Math.abs(last) > Math.abs(curVal)) {
                    survived = false;
                    break;
                } else {
                    asteroidStack.pop();
                    survived = false;
                    break;
                }
            }
            if (survived)
                asteroidStack.push(curVal);
            
        }

        int n = asteroidStack.size();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--)
            ans[i] = asteroidStack.pop();

        return ans;
    }
} 
