class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
       HashMap<Integer,Integer> map= new HashMap<>();


        for(int i=0;i<n;i++){
            int required=target-nums[i];
            if(map.containsKey(required)){
                int idx=map.get(required);
                return new int[]{idx,i};
            }
            else map.put(nums[i],i);
        }

        return nums;
    }
}
