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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> data = new HashSet<>();
        
        ListNode cursor = head;
        ListNode prev = null;
        while(cursor != null){
            if(data.contains(cursor.val)){
                prev.next = cursor.next;
                prev = prev;
                cursor = cursor.next;
            }else{
                data.add(cursor.val);    
                prev = cursor;
                cursor = cursor.next;
            }
            
        }
        
        return head;
    }
}