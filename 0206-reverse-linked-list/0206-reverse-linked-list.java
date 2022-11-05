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
        ListNode cursor = head;
        ListNode prev = null;
        while(cursor!=null){
            ListNode temp = cursor.next; //move 2 to temp
            
            cursor.next = prev; //move null to cursor.next
            
            prev = cursor;  // move 1 to prev
            cursor = temp; // move 2 to cursor
        }
        head = prev;
        return head;
    }
    
}
