/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){return head;}
        ListNode dummyHead = new ListNode(0, head);
        ListNode prev = dummyHead;

        ListNode temp = head;
        while (temp != null) {
            if (temp.next!=null&& temp.val== temp.next.val) {
                while (temp.next != null && temp.val== temp.next.val) {
                    temp = temp.next;
                }
                 prev.next = temp.next;

            } 
            else 
            {
                prev = prev.next;
            }        
        temp = temp.next;
        }

        return dummyHead.next;

    }
}