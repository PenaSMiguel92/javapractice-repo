import java.util.*;
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurMap = new HashMap<>();
        Set<Integer> occurences = new HashSet<>();

        for (int num : arr) {
            int val = occurMap.get(num) == null ? 0 : occurMap.get(num) + 1;
            occurMap.put(num, val);
        }
        for (int occur : occurMap.values())
            if (!occurences.add(occur))
                return false;

        return true;
    }
} 
