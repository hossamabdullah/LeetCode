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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> data = new ArrayList<>();
        data.addAll(getAllElementsOfTree(root1));
        data.addAll(getAllElementsOfTree(root2));
        
        Collections.sort(data);
        return data;
    }
    
    public List<Integer> getAllElementsOfTree(TreeNode node){
        if(node == null)
            return new ArrayList<>();
        
        List<Integer> data = new ArrayList<>();
        data.add(node.val);
        
        data.addAll(getAllElementsOfTree(node.left));
        data.addAll(getAllElementsOfTree(node.right));
        return data;
    }
}