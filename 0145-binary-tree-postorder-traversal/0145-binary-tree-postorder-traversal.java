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
    public List<Integer> postorderTraversal(TreeNode root) {
        return traversal(root, new ArrayList<Integer>());
    }

    private List<Integer> traversal(TreeNode root, List<Integer> res){
        if(root == null)
            return res;
        
        
        traversal(root.left, res);
        traversal(root.right, res);

        res.add(root.val);
        return res;
    }
}