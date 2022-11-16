/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        
        int l = 0;
        if(root.left == null)
            l = 1000000;
        else
            l = minDepth(root.left);
        
        int r = 0;
        if(root.right == null)
            r = 1000000;
        else
            r = minDepth(root.right);
        
        if(l < r){
            return l+1;
        }else{
            return r+1;
        }
    }
}