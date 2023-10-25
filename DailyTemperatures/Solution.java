import java.util.*;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>(temperatures.length);

        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                ans[i] = 0;
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty()) {
                int index = stack.pop();
                if (temperatures[index] > temperatures[i]) {
                    ans[i] = index - i;
                    break;
                }
            }
            stack.push(i);
        }
        return ans;
    }
}
