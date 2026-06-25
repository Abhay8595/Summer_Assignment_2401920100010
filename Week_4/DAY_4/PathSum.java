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
    boolean possible(TreeNode root, int targetSum,int currSum){
        if(root==null) return false;
        currSum+=root.val;
        if(root.left==null&&root.right==null){
            if(currSum==targetSum) return true;
            else return false;
        }
        boolean way1=possible(root.left,targetSum,currSum);
        boolean way2=possible(root.right,targetSum,currSum);

        return way1||way2;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return possible(root,targetSum,0);
    }
}
