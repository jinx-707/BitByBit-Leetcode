/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        ListNode temp= new ListNode(0);
        temp.next=head;
        ListNode prev = temp;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode start = prev.next;       
        ListNode nextNode = start.next;  
        for (int i = 0; i < right - left; i++) {
            start.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
            nextNode = start.next;
        }

        return temp.next;
        }
    }
