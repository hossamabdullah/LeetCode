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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cursor = head;
        int length = 1;
        while(cursor.next!=null){
            cursor = cursor.next;
            length++;
        }
        
        int[] data = new int[length];
        cursor = head;
        length = 0;
        while(cursor!=null){
            data[length] = cursor.val;
            cursor = cursor.next;
            length++;
        }

        System.out.println(length);
        System.out.println(data[k-1]+", "+data[length-k]);
        int temp = data[k-1];
        data[k-1] = data[length-k];
        data[length-k] = temp;
        System.out.println(data[k-1]+", "+data[length-k]);
        
        ListNode prev = null;
        for(int i=length-1; i>=0; i--){
            
            ListNode current = new ListNode();
            current.val = data[i];
            current.next = prev;
            prev = current;
        }
        
        return prev;
    }
} 