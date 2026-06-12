class Solution {
    public void fillCompress(int idx,int count,char[] chars){
        while(count!=0){
            chars[idx--]=(char)((count%10)+'0');
            count=count/10;
        }
    }
    public int compress(char[] chars) {
        int idx=0;
        int n=chars.length;

        for(int i=0;i<n;i++){
            char curr=chars[i];
            int j=i;
            while(j<n&&chars[j]==curr) j++;
            int count=j-i;
            chars[idx++]=curr;
            if(count==1) continue;
            else if(count<10){
                fillCompress(idx,count,chars);
                idx++;
            }
            else if(count<100){
                fillCompress(idx+1,count,chars);
                idx+=2;
            }
            else if(count<1000){
                fillCompress(idx+2,count,chars);
                idx+=3;
            }
            else{
                fillCompress(idx+3,count,chars);
                idx+=4;
            }
            i=j-1;
        }

        return idx;
    }
}
