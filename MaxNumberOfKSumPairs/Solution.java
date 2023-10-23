import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        if (nums.length <= 1)
            return 0;

        List<Integer> numList = new ArrayList<>(nums.length);
        Arrays.sort(nums);
        for (int num : nums)
            numList.add(num);
        int operations = 0, current = 0, comp = 0;
        while (!numList.isEmpty()) {
            
            if (numList.contains(k - numList.get(current))) {
                comp = numList.lastIndexOf(k - numList.get(current));
                if (comp == current)
                    break;
                numList.remove(comp);
                numList.remove(current);
                operations++;
                current = 0;
            } else {
                current++;
            } 
        }
        return operations;
    }
}
