class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = -1;
        if(matrix[m - 1][n - 1] < target || matrix[0][0] > target){
            return false;
        }
        for(int i = 0;i<m;i++){
            if(matrix[i][n - 1]>=target){
                row = i;
                break;
            }
        }
        if (row == -1) return false;
        int start = 0;
        int end = n-1;
        while (start <= end) {
            int index = start + (end - start) / 2;
            if (matrix[row][index] == target) {
                return true;
            } else if (matrix[row][index] < target) {
                start = index + 1;
            } else {
                end = index - 1;
            }
        }

        
    return false;
    }
}