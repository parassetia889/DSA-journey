class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] lPro = new int[n];
        int[] rPro = new int[n];

        lPro[0]=1;
        int curr=nums[0];
        for(int i=1; i<n; i++){
            lPro[i] = lPro[i-1]*nums[i-1];
        }

        rPro[n-1]=1;
        curr=nums[n-1];
        for(int i=n-2; i>=0; i--){
            rPro[i] = rPro[i+1]*nums[i+1];
        }


        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = lPro[i]*rPro[i];
        }

        return res;
            
    }
}