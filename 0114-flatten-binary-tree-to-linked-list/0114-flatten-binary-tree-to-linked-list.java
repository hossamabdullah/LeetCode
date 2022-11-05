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
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        
        if(left == null){
            root.right = right;
            return;
        }
        if(right == null){
            root.right = left;
        }
        
        
        // System.out.println(root.val+"==========="+left.val);
        TreeNode node = left;
        while(node.right!=null){
            node = node.right;
            System.out.println(node.val);
        }
        
        root.right = left;
        while(left.right!=null){
            left = left.right;
        }
        left.right = right;
        
        
        root.left = null;
    }
}