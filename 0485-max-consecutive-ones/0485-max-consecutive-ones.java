class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0, maxLen=0;
        for(int right=0; right<nums.length; right++){
            if(nums[right] == 0)
                count=0;
            else
                count++;

            maxLen = Math.max(count, maxLen);
        }

        return maxLen;
    }
}