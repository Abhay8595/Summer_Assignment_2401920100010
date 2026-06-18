class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        int n=tokens.length;

        for(int i=0;i<n;i++){
            String curr=tokens[i];
            char last= curr.charAt(curr.length()-1);
            if(Character.isDigit(last)){
                int num=Integer.parseInt(curr);
                st.push(num);
            }
            else{
                int b=st.pop();
                int a=st.pop();
                int ans=0;
                if(curr.equals("*")) ans=a*b;
                else if(curr.equals("+")) ans=a+b;
                else if(curr.equals("-")) ans=a-b;
                else ans=a/b;
                st.push(ans);
            }
        }

        return st.pop();
    }
}
