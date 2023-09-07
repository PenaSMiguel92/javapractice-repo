public class Main {
    public static void main(String[] args) {
        Solution sol1 = new Solution(6);
        Solution sol2 = new Solution(1);
        Solution sol3 = new Solution(1);
        Solution sol4 = new Solution(32);
        Solution sol5 = new Solution(1256);

        System.out.println(sol1.guessNumber(10));
        System.out.println(sol2.guessNumber(1));
        System.out.println(sol3.guessNumber(2));
        System.out.println(sol4.guessNumber(100));
        System.out.println(sol5.guessNumber(10000));

    }
} 
