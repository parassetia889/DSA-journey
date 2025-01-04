class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxi = nums[0];

        int sum = 0;
        for(int i : nums){
            sum += i;
            maxi = Math.max(sum, maxi);
            if(sum < 0)
                sum = 0;

            
        }
        return maxi;
    }
}