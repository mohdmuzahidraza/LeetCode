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
    TreeNode dummy = new TreeNode(-1);
    TreeNode curr = dummy;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        increasingBST(root.left);
        root.left = null;
        curr.right = root;
        curr = root;

        increasingBST(root.right);
        return dummy.right;
    }
}