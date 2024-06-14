class Solution {
    public int minIncrementForUnique(int[] nums) {

       int minMoves = 0;
       Arrays.sort(nums);

       for(int i = 1; i < nums.length; i++){
        if(nums[i] <= nums[i-1]){
            int moves = nums[i-1]-nums[i]+1;
            minMoves +=  moves;

            nums[i] = nums[i-1]+1;
            }
       } 

       return minMoves;
    }
}