public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.eraseOverlapIntervals(new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } }));
        System.out.println(sol.eraseOverlapIntervals(new int[][] { { 1, 2 }, { 1, 2 }, { 1, 2 } }));
        System.out.println(sol.eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}}));
    }
}
