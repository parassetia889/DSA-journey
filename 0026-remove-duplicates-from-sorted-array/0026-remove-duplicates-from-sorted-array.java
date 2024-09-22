class Solution {
    public int removeDuplicates(int[] nums) {
        
        int lastSorted = 0;
        if(nums.length == 1)
            return 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[lastSorted])
                nums[++lastSorted] = nums[i];
        }

        return lastSorted+1;
    }
}