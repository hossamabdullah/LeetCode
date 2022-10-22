import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder l1Str = new StringBuilder();
        while(l1 != null){
            l1Str.append(l1.val);
            l1  = l1.next;
        }
        l1Str.reverse();
        
        StringBuilder l2Str = new StringBuilder();
        while(l2 != null){
            l2Str.append(l2.val);
            l2 = l2.next;
        }
        l2Str.reverse();
        
        BigInteger bi1 = new BigInteger(l1Str.toString());
        BigInteger bi2 = new BigInteger(l2Str.toString());
        BigInteger bi3 = bi1.add(bi2);
        StringBuilder res = new StringBuilder(bi3.toString());
        res.reverse();
        char[] resLNode = res.toString().toCharArray();
        
        ListNode resultRoot = null;
        ListNode node = null;
        
        for(char r : resLNode){
            ListNode c = new ListNode();
            int rr = Integer.parseInt(r+"");
            c.val = rr;
            
            if(node != null){
                node.next = c;
                node = c;
            }else{
                resultRoot = c;
                node = c;
            }
        }
        return resultRoot;
    }
}