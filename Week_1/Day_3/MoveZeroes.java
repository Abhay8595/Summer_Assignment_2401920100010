class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int zeroidx=-1;
        int i=0;

        while(i<n&&nums[i]!=0) i++;

        zeroidx=i;
        i++;

        while(i<n){
            if(nums[i]!=0){
                nums[zeroidx]=nums[i];
                nums[i]=0;
                zeroidx++;
            }
            i++;
        }
    }
}
