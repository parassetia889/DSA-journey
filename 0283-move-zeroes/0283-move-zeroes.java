class Solution {
    public void moveZeroes(int[] nums) {
        int lastZero = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nums[lastZero++] = nums[i];
        }

        while(lastZero < nums.length)
            nums[lastZero++] = 0;
    }
}