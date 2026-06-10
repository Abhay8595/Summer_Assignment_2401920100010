class Solution {
    public void BuiltLPS(String s,int []lps,int n){
        // LPS[i]
        // Length of the longest proper prefix
        // which is also a suffix
        // for substring pattern[0...i]
        
        lps[0]=0;
        int i=1;
        int length=0;
        while(i<n){
            char ch1=s.charAt(i);
            char ch2=s.charAt(length);
            if(ch1==ch2){
                length++;
                lps[i]=length;
                i++;
            }
            else{
                //try for lps[i] for smaller lps
                if(length!=0){
                    length = lps[length - 1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }

        }
    }
    public int strStr(String haystack, String needle) {
        int n1=haystack.length();
        int n2=needle.length();
        if(n2>n1) return -1;   

        int lps[]=new int[n2];
        BuiltLPS(needle,lps,n2);

        int i=0;
        int j=0;
        while(i<n1){
            if(j==n2)  return i-n2;
            char ch1=haystack.charAt(i);
            char ch2=needle.charAt(j);
            if(ch1==ch2){
                i++;
                j++;
            }
            else{
               if(j!=0){
                 j=lps[j-1];
               }
               else{
                 i++;
               }
            }
        }

        if(j==n2) return i-n2;
        else return -1;   
    }
}
