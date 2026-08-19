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
        ListNode first = head;
        ListNode second = new ListNode(-1);
        second.next = head;
        ListNode tmp = second;
        // if (head.next == null && n==1){
        //     return null;
        // }

        while (n !=1){
            n--;
            first=first.next;
        }
        while (first.next != null){

            first=first.next;
            second=second.next;

        }

        second.next = second.next.next;

        return tmp.next;
    }
}
