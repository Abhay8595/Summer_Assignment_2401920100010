class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int sum=0;
        while(i<k){
            sum+=nums[i];
            i++;
        }
        double maxavg=sum/(k*1.0);
        for(i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            double curravg=sum/(k*1.0);
           maxavg=Math.max(curravg,maxavg);
        }

        return maxavg;
    }
}
