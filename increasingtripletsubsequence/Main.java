public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.increasingTriplet(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(sol.increasingTriplet(new int[] { 5, 4, 3, 2, 1 }));
        System.out.println(sol.increasingTriplet(new int[] { 2, 1, 5, 0, 4, 6 }));
        System.out.println(sol.increasingTriplet(new int[] { 20, 100, 10, 12, 5, 13 }));
        System.out.println(sol.increasingTriplet(new int[] {1, 5, 0, 4, 1, 3});
        System.out.println(sol.increasingTriplet(new int[] {1}));
        System.out.println(sol.increasingTriplet(new int[] {0, 4, 2, 1, 0, -1, -3}));

    }
}
