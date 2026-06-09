class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean rowBool[] = new boolean[row];
        boolean colBool[] = new boolean[column];
        for(int i = 0;i<column;i++){
            for(int j = 0;j<row;j++){
                if(matrix[j][i] == 0){
                    rowBool[j] = true;
                    colBool[i] = true;
                }
               
            }
        }
        for(int i = 0;i<column;i++){
            for(int j = 0;j<row;j++){
                if(rowBool[j] || colBool[i] ){
                    matrix[j][i] = 0;
                }
            }
        }
        
    }
}