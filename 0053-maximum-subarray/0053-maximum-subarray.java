class Solution {
    public int maxSubArray(int[] nums) {
        
       int maxI = Integer.MIN_VALUE, sum=0;
       for(int i : nums){
        sum += i;
        maxI = Math.max(sum, maxI);

        if(sum < 0)
            sum = 0;
       } 
       return maxI;
    }
}