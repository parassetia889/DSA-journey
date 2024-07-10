class Solution {
    public static boolean canDistribute(int[] quantities, int maxProducts, int stores) {
        int requiredStores = 0;
        for (int quantity : quantities) {
            // Calculate the number of stores needed for the current quantity
            requiredStores += Math.ceil(quantity*1.0 / maxProducts);
            if (requiredStores > stores) {
                return false; // Too many stores required
            }
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        
        int low = 0, high = 0, ans = -1;

        for(int quantity : quantities){
            high = Math.max(high, quantity);
        }

        while(low <= high){

            int mid = (low+high)/2;
            if(canDistribute(quantities, mid, n)){
                ans = mid;
                high = mid-1;
            }else
                low = mid+1;
            
        }

        return ans;
    }
}