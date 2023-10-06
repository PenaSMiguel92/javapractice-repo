public class Main {
    public static void main(String[] args) {
        ListNode list1 = ListNode.generateListFromArray(new int[] { 1, 3, 4, 7, 1, 2, 6 });
        ListNode list2 = ListNode.generateListFromArray(new int[] { 1, 2, 3, 4 });
        ListNode list3 = ListNode.generateListFromArray(new int[] { 2, 1 });
        Solution sol = new Solution();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(sol.deleteMiddle(list1));
        System.out.println(sol.deleteMiddle(list2));
        System.out.println(sol.deleteMiddle(list3));
    }
}
