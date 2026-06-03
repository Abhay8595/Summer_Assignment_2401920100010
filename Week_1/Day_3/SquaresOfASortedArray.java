class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];

        int i=0;
        //find first +ve ele in array
        while(i<n&&nums[i]<0) i++;
        int j=i;
        i=i-1;
        int idx=0;
        while(i>=0&&j<n){
            int a=Math.abs(nums[i]);
            int b=nums[j];
            if(a>b){
                ans[idx++]=b*b;
                j++;
            }
            else {
                ans[idx++]=a*a;
                i--;
            }
        }

        while(i>=0){
            ans[idx++]=nums[i]*nums[i];
            i--;
        }
        while(j<n){
             ans[idx++]=nums[j]*nums[j];
             j++;
        }

        return ans;
    }
}
