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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode cursor = head;
        while(cursor!=null){
            length++;
            cursor = cursor.next;
        }
        
        int mid = length / 2 + 1;
        int index = 1;
        // ListNode midNode = null;
        cursor = head;
        while(index != mid){
            index++;
            cursor = cursor.next;
        }
        
        return cursor;
    }
}