public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
         
        ListNode even_start = head.next;
        ListNode odd = head;
        ListNode even = head.next;

        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            even.next = odd.next.next;
            odd = odd.next;
            even = even.next;
        }
        
        odd.next = even_start;
        return head;
    }
}
