class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int maxp=strs[0].length();
        String comp=strs[0];
        for(int i=1;i<n;i++){
            String s=strs[i];
            int x=0;
            int y=0;
            int currpref=0;
            while(x<maxp&&y<s.length()){
                char ch1=comp.charAt(x++);
                char ch2=s.charAt(y++);
                if(ch1==ch2){
                    currpref++;
                }
                else break;
            }
            maxp=Math.min(maxp,currpref);
            if(maxp==0) break;
        }

        StringBuilder sb= new StringBuilder();
        sb.append("");
        for(int i=0;i<maxp;i++){
            sb.append(comp.charAt(i));
        }

        return sb.toString();
    }
}
