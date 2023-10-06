public class Solution {
    public boolean deleteMiddle;
    public int size;

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        deleteMiddle = false;
        size = 1;
        countSizeAndDeleteMiddle(head, 1);
        //System.out.println(count);
        return head;
    }
    
    public void countSizeAndDeleteMiddle(ListNode head, int count) {
        if (head.next == null) {
            deleteMiddle = true;
            size = count;
            return;
        }
        count++;
        countSizeAndDeleteMiddle(head.next, count);
        if (deleteMiddle && count - 1 == (size / 2) ) {
            head.next = head.next.next;
            return;
        }
    }
}
