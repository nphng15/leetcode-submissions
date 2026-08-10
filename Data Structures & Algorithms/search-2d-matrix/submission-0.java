class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l_row = 0;
        int r_row = matrix.length-1;

        int l_col = 0;
        int r_col = matrix[0].length-1;
        int tmp=-1;
        while (l_row<=r_row){
            int mid = (l_row + r_row)/2;
            if (target >= matrix[mid][l_col] && target <= matrix[mid][r_col]){
                tmp = mid;
                break;
            }
            else if (target < matrix[mid][l_col]) r_row = mid-1;
            else if (target > matrix[mid][r_col]) l_row = mid+1;
        }
        if (tmp == -1) return false;

        while (l_col<=r_col){
            int mid = (l_col+r_col)/2;
            if (target==matrix[tmp][mid]) return true;
            else if (target>matrix[tmp][mid]) l_col=mid+1;
            else r_col=mid-1;
        }
        return false;
    }
}
