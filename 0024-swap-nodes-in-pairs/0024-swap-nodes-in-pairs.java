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
    public ListNode swapPairs(ListNode head) {
        ListNode cursor = head;
        if(cursor!=null && cursor.next==null)
            return cursor;
        if(cursor==null)
            return null;
        ListNode nextCursor = cursor.next;
        
        cursor.next = nextCursor.next;
        nextCursor.next = cursor;
        ListNode remainingResult = swapPairs(cursor.next);
        cursor.next = remainingResult;
        return nextCursor;
    }
}