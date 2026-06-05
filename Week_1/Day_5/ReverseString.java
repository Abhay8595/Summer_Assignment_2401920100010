class Solution {
    public void swap(int i,int j ,char [] ch){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            swap(i++,j--,s);
        }
    }
}
