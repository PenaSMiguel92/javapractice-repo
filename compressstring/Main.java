public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] ca1 = new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int ans1 = sol.compress(ca1);
        char[] ca2 = new char[] { 'a' };
        int ans2 = sol.compress(ca2);
        char[] ca3 = new char[] { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int ans3 = sol.compress(ca3);
        char[] ca4 = new char[] {'a', 'b', 'c'};
        int ans4 = sol.compress(ca4);
        char[] ca5 = new char[] {'a', 'a', 'a', 'a', 'a', 'b'};
        int ans5 = sol.compress(ca5);
        char[] ca6 = new char[] { 'a', 'a', 'a', 'b', 'b', 'a', 'a' };
        int ans6 = sol.compress(ca6);

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

        System.out.println("Case 4: ");
        for (int i = 0; i < ans4; i++)
            System.out.print(ca4[i]);

        System.out.print("\n");

        System.out.println("Case 5: ");
        for (int i = 0; i < ans5; i++)
            System.out.print(ca5[i]);

        System.out.print("\n");

        System.out.println("Case 6: ");
        for (int i = 0; i < ans6; i++)
            System.out.print(ca6[i]);

        System.out.print("\n");

    }
}
