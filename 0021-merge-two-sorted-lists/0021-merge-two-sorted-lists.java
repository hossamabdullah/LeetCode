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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = null;
        ListNode node = null;
        ListNode n = null;
        while(list1 != null && list2 != null){
            int val = 0;
            if(list1.val < list2.val){
                val = list1.val;
                list1 = list1.next;
            }else{
                val = list2.val;
                list2 = list2.next;
            }
            //System.out.println(val);
            n = new ListNode(val);
            
            if(node == null){
                node = n;
                root = n;
            }else{
                node.next = n;
                node = n;
            }
        }
        
        while(list1 != null){
            n = new ListNode(list1.val);
            list1 = list1.next;
            
            if(node == null){
                node = n;
                root = n;
            }else{
                node.next = n;
                node = n;
            }
        }
        
        while(list2 != null){
            n = new ListNode(list2.val);
            list2 = list2.next;
            
            if(node == null){
                node = n;
                root = n;
            }else{
                node.next = n;
                node = n;
            }
        }
        
        
        return root;
    }
}