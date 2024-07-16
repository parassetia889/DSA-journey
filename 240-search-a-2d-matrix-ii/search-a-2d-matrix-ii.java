class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length, col = matrix[0].length;

        int rowIndx = 0, colIndx = col-1;

        while(rowIndx < row && colIndx >= 0){
            int ele = matrix[rowIndx][colIndx];
            
            if(ele == target)
                return true;
            else if(ele > target)
                colIndx--;
            else
                rowIndx++;
        }

        return false;
    }
}