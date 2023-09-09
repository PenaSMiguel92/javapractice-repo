import java.util.*;

public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        List<Integer> answer = new ArrayList<>();
        int m = potions.length;
        int maxPotion = Integer.MIN_VALUE;
        for (int potion : potions) {
            if (potion > maxPotion)
                maxPotion = potion;
        }

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
        for (int i = 0; i < potions.length; i++) {
            int potion = potions[i];
            if (potion >= minPotion)
                return i;
        }
        return 0;
    }
}
