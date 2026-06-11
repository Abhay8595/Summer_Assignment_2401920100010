class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        int end=0;
        int idx=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==' '){
                idx=i-1;
                while(idx>=end){
                    char ch2=s.charAt(idx);
                    sb.append(ch2);
                    idx--;
                }
                end=i+1;
                sb.append(ch);
            }
        }

        idx=n-1;
        while(idx>=end){
            char ch2=s.charAt(idx);
            sb.append(ch2);
            idx--;
        }


        return sb.toString();
    }
}
