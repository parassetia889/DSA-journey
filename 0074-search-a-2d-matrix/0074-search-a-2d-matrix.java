class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0, end = row*col-1;

        while(start <= end){

            int mid = (start+end)/2;
            int ele = matrix[mid/col][mid%col];

            if(ele == target)
                return true;
            else if(ele < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return false;
    }
}