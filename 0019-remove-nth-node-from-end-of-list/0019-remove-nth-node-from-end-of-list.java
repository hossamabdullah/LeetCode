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
        int length = 0;
        ListNode cursor = head;
        while(cursor!=null){
            length++;
            cursor = cursor.next;
        }
        
        n = length - n;
        int index = 0;
        ListNode prevCursor = null;
        cursor = head;
        while(index != n){
            prevCursor = cursor;
            cursor = cursor.next;
            index++;
        }
        
        if(prevCursor == null && cursor.next == null)
            return null;
        else if(prevCursor == null){
            cursor = cursor.next;
            return cursor;
        }else
            prevCursor.next = cursor.next;
        
        return head;
    }
}