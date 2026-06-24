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
    /*for left node to be valid
      -> its smaller than the range which end point is curr node 
      ->for right it should greater than start point */
    
    public boolean valid(TreeNode root,long start,long end){
        if(root==null) return true;
        if(root.val<=start || root.val>=end) return false;

        boolean lst=valid(root.left,start,root.val);
        boolean rst=valid(root.right,root.val,end);

        return lst && rst;
    }
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
