class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] lPro = new int[n];
        int[] rPro = new int[n];

        int p = 1;
        for(int i = 0 ; i < n; i++){
            lPro[i] = p;
            p *= nums[i];
        }

        p = 1;
        for(int i = n-1; i >= 0; i--){
            rPro[i] = p;
            p *= nums[i];
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = lPro[i]*rPro[i];

        return res;
    }
}

// 1 1 2 6
// 24 12 4 1