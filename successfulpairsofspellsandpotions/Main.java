import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.successfulPairs(new int[] { 5, 1, 3 }, new int[] { 1, 2, 3, 4, 5 }, 7)));
        System.out.println(Arrays.toString(sol.successfulPairs(new int[] { 3, 1, 2 }, new int[] { 8, 5, 8 }, 16)));
    }
}
