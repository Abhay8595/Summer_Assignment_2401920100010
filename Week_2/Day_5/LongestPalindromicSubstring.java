class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();

        int dp[][]=new int[n+1][n+1];

        for(int i=n;i>0;i--){
            char ch1=s.charAt(i-1);
            for(int j=i;j<=n;j++){
                char ch2=s.charAt(j-1);
                if(ch1!=ch2) continue;
                if(i==j) dp[i][j]=1;
                else if(i+1==j) dp[i][j]=2;
                else if(dp[i+1][i+1]>=1&&dp[i+1][j-1]>=1){
                    dp[i][j]=j-i+1;
                } 
            }
        }  

        int x=0,y=0;
        int max=-1; 

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(max<dp[i][j]){
                    max=dp[i][j];
                    x=i;
                    y=j;
                }
            }
        } 

        StringBuilder sb= new StringBuilder();
        for(int i=x;i<=y;i++){
            sb.append(s.charAt(i-1));
        }  

        return sb.toString();   
    }
}
