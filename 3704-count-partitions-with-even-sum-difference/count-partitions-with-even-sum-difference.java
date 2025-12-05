class Solution {
    public int countPartitions(int[] nums) {
        
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        int count=0, leftSum=nums[0], rightSum=sum-nums[0];

        for(int i=1; i<nums.length; i++){
            if((rightSum-leftSum)%2 == 0){
                count++;
            }
            leftSum += nums[i];
            rightSum -= nums[i];
        }

        return count;
    }
}