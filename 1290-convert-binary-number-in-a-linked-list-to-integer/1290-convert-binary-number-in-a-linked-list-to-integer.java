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
    public int getDecimalValue(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while(head != null){
            builder.append(head.val);
            head = head.next;
        }
        int res = Integer.parseInt(builder.toString(), 2);
        return res;
    }
}