class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null) { 
            if (slow.next != null) {     
                slow.val = slow.next.val;
                slow.next = slow.next.next;
            }
        } 
        else { 
            slow.next = slow.next.next;
        }
        return head;
    }
}
