class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        for(int i = n-1; i >= 1; i--){
            boolean swap = false;
            for(int j = 0; j < i; j++){
                if(nums[j]  > nums[j+1]){
                    swap = true;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if(!swap)
                break;
        }
    }
}