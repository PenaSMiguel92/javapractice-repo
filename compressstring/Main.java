public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] ca1 = new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int ans1 = sol.compress(ca1);
        char[] ca2 = new char[] { 'a' };
        int ans2 = sol.compress(ca2);
        char[] ca3 = new char[] { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int ans3 = sol.compress(ca3);

        System.out.println("Case 1: ");
        for (int i = 0; i < ans1; i++)
            System.out.print(ca1[i]);

        System.out.print("\n");
        System.out.println("Case 2: ");
        for (int i = 0; i < ans2; i++)
            System.out.print(ca2[i]);
        
        System.out.print("\n");
        System.out.println("Case 3: ");
        for (int i = 0; i < ans3; i++)
            System.out.print(ca3[i]);

        System.out.print("\n");
    }
}
