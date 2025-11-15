class Solution {
    public ListNode rotateRight(ListNode start, int k) {
        if (start == null || start.next == null || k == 0)
            return start;
        int size = 1;
        ListNode end = start;
        while (end.next != null) {
            end = end.next;
            size++;
        }
        k = k % size;
        if (k == 0) return start;
        ListNode mid = start;
        for (int step = 0; step < size - k - 1; step++) {
            mid = mid.next;
        }
        ListNode newStart = mid.next; 
        mid.next = null;         
        end.next = start;              
        return newStart;
    }
}
