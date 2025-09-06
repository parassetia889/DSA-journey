class Solution {
    public int findDuplicate(int[] nums) {
        
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int idx = Math.abs(nums[i]);
            if(nums[idx] < 0)
                return idx;
            
            nums[idx] *= -1;
        }
        return len;
    }
}