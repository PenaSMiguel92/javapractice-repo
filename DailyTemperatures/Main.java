import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[] {30, 40, 50, 60})));
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[] {30, 60, 90})));
    }
}
