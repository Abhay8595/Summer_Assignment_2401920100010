class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int i=0;
        int j=n-1;
        int max=0;
        while(i<j){
            if(height[i]>height[j]){
                int l=height[j];
                int b=j-i;
                max=Math.max(max,l*b);
                j--;
            }
            else if(height[i]<height[j]){
                int l=height[i];
                int b=j-i;
                max=Math.max(max,l*b);
                i++;
            }
            else{
                int l=height[j];
                int b=j-i;
                max=Math.max(max,l*b);
                j--;
                i++;
            }
        }

        return max;
    }
}
