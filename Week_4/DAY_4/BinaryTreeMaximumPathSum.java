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
    public int max(TreeNode root,int [] ans){
        if(root.left==null && root.right==null){
            ans[0]=Math.max(ans[0],root.val);
            return (root.val>=0)?root.val:-4000;
        }
        int ls=-4000;
        int rs=-4000;

        if(root.left!=null) ls=max(root.left,ans);
        if(root.right!=null) rs=max(root.right,ans);

        //we take this node if sum do not become negative
        ans[0]=Math.max(ans[0],ls);
        ans[0]=Math.max(ans[0],rs);
        ans[0]=Math.max(ans[0],root.val);

        int way1=ls+root.val;
        ans[0]=Math.max(ans[0],way1);

        int way2=rs+root.val;
        ans[0]=Math.max(ans[0],way2);

        int way3=way1+way2-root.val;
        ans[0]=Math.max(ans[0],way3);

        if(way1>=0 && way1>=way2) return way1;
        if(way2>=0 && way2>way1) return way2;
        if(root.val>=0) return root.val;
        else return -4000;


    }
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        int ans[]=new int[1];
        ans[0]=-4000;
        max(root,ans);
        return ans[0];
    }
}
