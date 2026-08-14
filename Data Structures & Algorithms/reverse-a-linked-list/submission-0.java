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
    public ListNode reverseList(ListNode head) {
       ListNode before=null;
       ListNode after=head;

       while (after != null){
            head = after;
            after = head.next;
            head.next = before;
            before = head;
       }

       return head;
    }
}
