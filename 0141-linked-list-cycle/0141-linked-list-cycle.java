/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<String> memoryLocations = new HashSet<>();
        
        ListNode cursor = head;
        while(cursor != null){
            if(memoryLocations.contains(cursor.toString())){
                return true;
            }else{
                memoryLocations.add(cursor.toString());
            }
            cursor = cursor.next;
        }
        return false;
    }
}