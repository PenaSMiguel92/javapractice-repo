public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxOperations(new int[] { 1, 2, 3, 4 }, 5));
        System.out.println(sol.maxOperations(new int[] { 3, 1, 3, 4, 3 }, 6));
        System.out.println(sol.maxOperations(new int[] {2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3));
    }
}
