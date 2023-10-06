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
        System.out.println(sol.findMinArrowShots(new int[][] { { 1, 2 } }));
        System.out.println(sol.findMinArrowShots(new int[][] {{77171087,133597895},{45117276,135064454},{80695788,90089372},{91705403,110208054},{52392754,127005153},{53999932,118094992},{11549676,55543044},{43947739,128157751},{55636226,105334812},{69348094,125645633}}));
    }
}
