class Solution {
    public static int isPossible(int[] nums, int k, int reqSum){
        int splitCount = 1, sum = 0;

        for(int num : nums){
            if(sum + num <= reqSum)
                sum += num;
            else{
                sum = num;
                splitCount++;
            }
        }
        return splitCount;
    }
    public int splitArray(int[] nums, int k) {
        
        if(nums.length < k)
            return -1;
        int low = 0, high = 0;

        for(int n : nums){
            low = Math.max(low, n);
            high += n;
        }

        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            int numOfSplits = isPossible(nums, k, mid);

            if(numOfSplits <= k){
                ans = mid;
                high = mid-1;
            }else
                low = mid+1;

        }
            return ans;
    }
}