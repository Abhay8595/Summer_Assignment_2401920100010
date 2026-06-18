class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int arr[]=new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&temperatures[i]>=temperatures[st.peek()]) st.pop();
            if(st.isEmpty()){
                arr[i]=n;
            }
            else{
                arr[i]=st.peek();
            }

            st.push(i);
        }

        for(int i=0;i<n;i++){
            arr[i]=(arr[i]==n)?0:arr[i]-i;
        }

        return arr;
    }
}
