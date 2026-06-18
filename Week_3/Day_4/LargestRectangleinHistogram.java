class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n=heights.length;
        int nextsmaller[]=new int[n];

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]) st.pop();
            if(st.isEmpty()){
                nextsmaller[i]=n;
            }
            else{
                nextsmaller[i]=st.peek();
            }

            st.push(i);
        }

        st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]) st.pop();
            if(st.isEmpty()){
                prevsmaller[i]=-1;
            }
            else{
                prevsmaller[i]=st.peek();
            }

            st.push(i);
        }

        int max=0;
        for(int i=0;i<n;i++){
            int width=(nextsmaller[i]-i)+(i-prevsmaller[i])-1;
            max=Math.max(max,heights[i]*width);
        }

        return max;

    }
}
