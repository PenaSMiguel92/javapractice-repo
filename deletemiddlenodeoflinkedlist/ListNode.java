public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }
    
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        String val = "[";
        val += iterateOverList(this);
        return val + "]";
    }

    public static String iterateOverList(ListNode current) {
        if (current.next == null) {
            return " " + current.val;
        }
        return " " + current.val + iterateOverList(current.next);
    }

    public static ListNode generateListFromArray(int[] nums) {
        ListNode head = new ListNode(-1, null);
        ListNode curPointer = head;
        for (int num : nums) {
            curPointer.next = new ListNode(num);
            curPointer = curPointer.next;
        }
        return head.next;
    }

}
