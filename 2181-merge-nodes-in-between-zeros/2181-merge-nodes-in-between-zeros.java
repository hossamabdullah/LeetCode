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
    public ListNode mergeNodes(ListNode head) {
        ListNode result = new ListNode();
        ListNode lastNode = result;
        
        int sum = 0;
        while(head != null){
            if(head.val == 0){
                if(sum != 0){
                    lastNode.next = new ListNode();
                    lastNode.next.val = sum;
                    lastNode = lastNode.next;
                }
                sum = 0;
                head = head.next;
            }else{
                sum+=head.val;
                head = head.next;
            }
        }
        
        return result.next;
    }
    
    
}