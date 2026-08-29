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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> val = new ArrayList<>();
        preorder(root, val);
        return val;
    }

    public static void preorder(TreeNode root, List<Integer> val){
        if(root == null){
            return;
        }
        val.add(root.val);
        preorder(root.left, val);
        preorder(root.right, val);
    }
}