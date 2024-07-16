class Solution {
    public static int findMax(int[][] mat, int rows, int col){
        int max = -1;
        int rowIndx = -1;
        
        for(int i = 0; i < rows; i++){
            if( mat[i][col] > max){
                max =  mat[i][col];
                rowIndx = i;
            }
        }
        return rowIndx;
    }

    public int[] findPeakGrid(int[][] mat) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        int start = 0, end = cols-1;

        while(start <= end){

            int mid = (start+end)/2;
            int row = findMax(mat, rows, mid);

            int leftEle = mid-1 >= 0 ? mat[row][mid-1] : -1;
            int rightEle = mid+1 < cols ? mat[row][mid+1] : -1;

            if(mat[row][mid] > leftEle && mat[row][mid] > rightEle)
                return new int[]{row, mid};
            else if(mat[row][mid] < leftEle)
                end = mid-1;
            else 
                start = mid+1;

        }

        return new int[]{-1,-1};
    }
}