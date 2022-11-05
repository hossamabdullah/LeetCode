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
    public ListNode removeElements(ListNode head, int val) {
        ListNode cursor = head;
        ListNode prev = null;
        while(cursor != null){
            if(cursor.val == val){
                if(prev == null){
                    head = head.next;
                }else{
                    prev.next = cursor.next;    
                }
            }else{
                prev = cursor;    
            }
            cursor = cursor.next;
            
        }
        return head;
    }
}