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
    public int max(TreeNode root,int [] dia){
        if(root==null) return 0;
        int leftnodes=max(root.left,dia);
        int rightnodes=max(root.right,dia);

        dia[0]=Math.max(leftnodes+rightnodes+1,dia[0]);

        return 1+Math.max(leftnodes,rightnodes);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int dia[]= new int[1];
        max(root,dia);
        return dia[0]-1;
    }
}
