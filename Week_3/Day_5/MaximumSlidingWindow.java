class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq= new ArrayDeque<>();
        int n=nums.length;
        int ans[]=new int[n-k+1];

        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]) dq.pollLast();
            dq.add(i);
        }

        ans[0]=nums[dq.peekFirst()];

        for(int i=k;i<n;i++){
            //remove element out of window
            while(!dq.isEmpty() && dq.peekFirst()<(i-k+1)) dq.pollFirst();

            //if curr ele is greter in window the prev ele smaller than that can be in window
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]) dq.pollLast();
            dq.add(i);
            ans[i-k+1]=nums[dq.peekFirst()];
        }

        return ans;
    }
}
