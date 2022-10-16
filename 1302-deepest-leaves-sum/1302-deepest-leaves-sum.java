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
    public int deepestLeavesSum(TreeNode root) {
        int[] res = findLeaves(root, 0);
        return res[0];
    }
    
    
    public int[] findLeaves(TreeNode node, int depth){
        if(node == null)
            return new int[]{0,0};
        
        if(node.left == null && node.right == null){
            System.out.println(node.val+"--"+depth);
            return new int[]{node.val, depth};
        }
        
        depth+=1;
        int[] resLeft = findLeaves(node.left, depth);
        int[] resRight = findLeaves(node.right, depth);
        if(resLeft[1] == resRight[1]){
            return new int[]{(resLeft[0] + resRight[0]) , resLeft[1]};
        }else if(resLeft[1] > resRight[1]){
            return resLeft;
        }else{
            return resRight;
        }
        
    }
}