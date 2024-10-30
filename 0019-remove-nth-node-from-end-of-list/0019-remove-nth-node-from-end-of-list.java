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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode prev=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==n){
            return head=head.next;

        }
        int i=1;
        int itofind=size-n;
        while(i<itofind){
           
               prev=prev.next;
               i++;
            
            
        }
         prev.next=prev.next.next;
        return head;

        
    }
}