import java.util.*;

public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        List<Integer> answer = new LinkedList<>();
        int m = potions.length;
        int maxPotion = potions[m - 1];

        for (int spell : spells) {
            int minPotion = (int) Math.ceil((double) success / spell);
            if (minPotion > maxPotion)
                answer.add(0);
            else 
                answer.add(m - lower_bound(potions, minPotion));
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int lower_bound(int[] potions, int minPotion) {
        int start = 0;
        int end = potions.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (potions[mid] < minPotion)
                start = mid + 1;
            else
                end = mid;
        }
        return end;
    }
}
