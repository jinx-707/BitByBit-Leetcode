class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr=node;
        ListNode newNode=curr.next;
        if(newNode!=null){
            curr.val=newNode.val;
            curr.next=newNode.next;
        }
    }
