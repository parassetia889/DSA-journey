class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int larr[] = new int[n];
        int rarr[] = new int[n];
        
        int p = 1;
        for(int i = 0; i < n; i++){
            larr[i] = p;
            p *= nums[i];
        }

        p = 1;
        for(int i = n-1; i >= 0; i--){
            rarr[i] = p;
            p *= nums[i];
        }

        for(int i = 0; i < n; i++){
            nums[i] = larr[i] * rarr[i];
        }

        return nums;
    }
}