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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int check=0;
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        while (l1 != null && l2 != null){
            int tmp = l1.val + l2.val + check;
            check= tmp/10;
            tmp = tmp % 10;
            
            curr.next = new ListNode(tmp);

            curr = curr.next;
            l1=l1.next;
            l2=l2.next;
        }

        while (l1!=null){
            int tmp = l1.val + check;
            check= tmp/10;
            tmp = tmp % 10;
            
            curr.next = new ListNode(tmp);
            curr=curr.next;
            l1 = l1.next;
        }
        
        while (l2!=null){
            int tmp = l2.val + check;
            check= tmp/10;
            tmp = tmp % 10;
            
            curr.next = new ListNode(tmp);
            curr=curr.next;
            l2 = l2.next;
        }

        if (check==1){
            curr.next = new ListNode(check);
        }

        return result.next;
    }
}
