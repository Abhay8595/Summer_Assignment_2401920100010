class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;

        int placedele=0;
        int tele=m*n;
        int i=0;
        int j=0;
        int startrow=0;
        int startcol=0;
        while(placedele<tele-1){
            while(j<n-1 && placedele<tele){
                ans.add(matrix[i][j]);
                placedele++;
                j++;
            }

            while(i<m-1 && placedele<tele){
                ans.add(matrix[i][j]);
                placedele++;
                i++;
            }

            while(j>startcol && placedele<tele){
                ans.add(matrix[i][j]);
                placedele++;
                j--;                
            }

            while(i>startrow && placedele<tele){
                ans.add(matrix[i][j]);
                placedele++;
                i--;                
            }

            m--;
            n--;
            i= ++startrow;
            j= ++startcol;
        }

        if(placedele!=tele) ans.add(matrix[i][j]);

        return ans;
    }
}
