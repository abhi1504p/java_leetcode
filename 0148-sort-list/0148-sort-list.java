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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        while (temp != null) {
            int g = temp.val;
            list.add(g);
            temp = temp.next;

        }
        Collections.sort(list);
       
        Integer arr[] = new Integer[list.size()];
        arr = list.toArray(arr);

        int i = 0;
         temp=head;
        while (temp != null) {
            temp.val = arr[i];
            temp = temp.next;
            i++;
        }

        return head;

    }
}