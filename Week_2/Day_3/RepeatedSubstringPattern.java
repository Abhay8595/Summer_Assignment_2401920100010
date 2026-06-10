class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        //largest block->n/2
        for(int i=1;i<=n/2;i++){
            if(n%i!=0) continue;
            int blocksize=i;
            int blocks=n/i;
            int blockidx=0;
            int start=i;
            while(start<n){
               char ch1=s.charAt(start);
               char ch2=s.charAt(blockidx);
                if(ch1!=ch2) break;
                start++;
                blockidx=(blockidx+1)%blocksize;
            }

            if(start==n) return true;
        }

        return false;
    }
}
