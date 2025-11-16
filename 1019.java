class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            arr.add(p.val);
            p = p.next;
        }
        int n = arr.size();
        int[] out = new int[n];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr.get(i) > arr.get(stk.peek())) {
                out[stk.pop()] = arr.get(i);
            }
            stk.push(i);
        }
        return out;
    }
}
