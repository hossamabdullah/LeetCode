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
    Map<Integer, String> data = new HashMap<>();
    
    public Solution(){
        data.put(0, "false");
        data.put(1, "true");
        data.put(2, "OR");
        data.put(3, "AND"); 
    }
    
    public boolean evaluateTree(TreeNode root) {
        
        if(root.left == null){ //leaf node
            if(root.val == 0)
                return false;
            else
                return true;
        }
        
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        
        if(root.val == 2)
            return left || right;
        else
            return left && right;
    }
}