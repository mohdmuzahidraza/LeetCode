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
    public void path(TreeNode root, List<String> val, String s){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            s += root.val;
            val.add(s);
            return;
        }
        path(root.left, val, s+ root.val+"->");
        path(root.right, val, s+ root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> val = new ArrayList<>();
        path(root, val, "");
        return val;
    }
}