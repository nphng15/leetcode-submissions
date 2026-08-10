class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l_row = 0;
        int r_row = matrix.length-1;

        int l_col = 0;
        int r_col = matrix[0].length-1;

        while (l_row<=r_row){
            int r_mid = (l_row+r_row)/2;
            int tmp=-1;
            while (l_col<=r_col){
                int c_mid = (l_col+r_col)/2;
                tmp=matrix[r_mid][c_mid];
                if (target == matrix[r_mid][c_mid]){
                    return true;
                }
                else if (target > matrix[r_mid][c_mid]) l_col = c_mid+1;
                else r_col = c_mid-1;

                
            }

            if (target > tmp){
                l_row = r_mid+1;
            }
            else{
                r_row = r_mid-1;
            }
            l_col = 0;
            r_col = matrix[0].length-1;
        }
        return false;
    }
}
