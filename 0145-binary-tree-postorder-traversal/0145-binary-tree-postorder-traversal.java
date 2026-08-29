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
        List<Integer>  val = new ArrayList<>();
        postorder(root, val);
        return val;
    }
    public static void postorder(TreeNode root, List<Integer> val){
        if(root == null){
            return;
        }
        postorder(root.left, val);
        postorder(root.right, val);
        val.add(root.val);
    }
}