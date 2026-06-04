class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;

        int i=0,j=n-1;
        while(i<n) sum+=mat[i][i++];
        i=0;
        while(j>=0){
            if(i!=j) sum+=mat[i][j];
            i++;
            j--;
        }

        return sum;
    }
}
