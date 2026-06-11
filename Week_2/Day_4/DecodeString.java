class Solution {
    public String decodeString(String s) {
        StringBuilder sb= new StringBuilder();
        Stack<Integer> st=new Stack<>();
        int k=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch-'0';
                k=k*10+num;
            }
            else if(ch=='['){
                st.push(k);
                k=0;
                sb.append(ch);
            }
            else if(ch==']'){
                StringBuilder curr=new StringBuilder();
                char last = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                while(last!='['){
                    curr.append(last);
                    last = sb.charAt(sb.length() - 1);
                    sb.deleteCharAt(sb.length() - 1);
                }

                curr.reverse();

                int repeat=st.pop();
                while(repeat!=0){
                    sb.append(curr);
                    repeat--;
                }
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
