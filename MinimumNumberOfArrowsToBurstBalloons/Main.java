public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.findMinArrowShots(new int[][] { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } }));
        System.out.println(sol.findMinArrowShots(new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } }));
        System.out.println(sol.findMinArrowShots(new int[][] { {} }));
        System.out.println(sol.findMinArrowShots(new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } }));
        System.out.println(
                sol.findMinArrowShots(new int[][] { { -2147483646, -2147483645 }, { 2147483646, 2147483647 } }));
        System.out.println(sol.findMinArrowShots(new int[][] { { 2, 3 }, { 2, 3 } }));
        System.out.println(sol.findMinArrowShots(new int[][] {{1, 2}}));
    }
}
