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
       ListNode dummy = new ListNode(0);

       dummy.next = head;
       int jumps = 0;
       ListNode l = head;

       while(jumps < n &&l != null){
        jumps++;
        l = l.next;
       }

       ListNode prev = dummy;
       ListNode curr = l;

       while(curr != null){
        curr = curr.next;
        prev = prev.next;
       }

       prev.next = prev.next.next;
       return dummy.next; 
    }
}