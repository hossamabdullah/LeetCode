/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode result = getTarget(cloned, target);
        // System.out.println(result);
        return result;
    }
    
    public TreeNode getTarget(TreeNode node, TreeNode target){
        if(node == null)
            return null;
        
        // System.out.println(node.val +", "+target.val);
        if(node.val == target.val)
            return node;

        TreeNode element = getTarget(node.left, target);
        if(element != null)
            return element;
        element = getTarget(node.right, target);
        if(element != null)
            return element;
        
        return null;
    }
}