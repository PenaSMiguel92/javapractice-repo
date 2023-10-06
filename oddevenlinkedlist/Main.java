public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode list1 = ListNode.generateListFromArray(new int[] { 1, 2, 3, 4, 5 });
        ListNode list2 = ListNode.generateListFromArray(new int[] { 2, 1, 3, 5, 6, 4, 7 });


        System.out.println(sol.oddEvenList(list1).toString());
        System.out.println(sol.oddEvenList(list2).toString());
    }
}
