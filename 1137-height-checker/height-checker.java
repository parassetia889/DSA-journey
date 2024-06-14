class Solution {

    public void sort(int nums[]){
        int n = nums.length;

        for(int i = 0; i < n-1; i++){
            boolean swap = false;
            for(int j = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    swap = true;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] =temp;
                }
            }
            if( !swap)
                break;
        }
    }

    public int heightChecker(int[] heights) {
        
        int count = 0;
        int n = heights.length;
        int[] expected = heights.clone();
        sort(expected);

        for(int i = 0; i < n; i++){
            if(expected[i] != heights[i])
                count++;
        }

        return count;
    }
}