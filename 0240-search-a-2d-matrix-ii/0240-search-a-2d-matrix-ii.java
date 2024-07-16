class Solution {

    public static int bs(int[] mat, int target){
        int start = 0, end = mat.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(mat[mid] == target)
                return mid;
            else if(mat[mid] > target)
                end = mid-1;
            else
                start = mid+1;
        }

        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++){

            if(bs(matrix[i], target) != -1)
                return true;
        }
            return false;
    }
}