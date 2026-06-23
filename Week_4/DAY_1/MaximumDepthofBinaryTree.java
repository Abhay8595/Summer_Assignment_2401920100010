class Solution {
    public int maxdep(TreeNode root){
        if(root==null) return 0;
        else return 1+Math.max(maxdep(root.left),maxdep(root.right));
    }
    public int maxDepth(TreeNode root) {
        return maxdep(root);
    }
}
