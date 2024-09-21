class Solution {
    public void moveZeroes(int[] nums) {
        

        int lastNonzero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nums[lastNonzero++] = nums[i];
        }

        while(lastNonzero < nums.length)
            nums[lastNonzero++] = 0;

    }
}