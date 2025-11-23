class Solution {
    public int findMin(int[] nums) {
        
        int low = 0, high = nums.length-1;
        if(nums[low] < nums[high])
            return nums[low];
        int ans = nums[low];

        while(low <= high){
            if(nums[low] < nums[high]){
                ans = Math.min(nums[low], ans);
                break;
            }
            int mid = (low+high)/2;
            ans = Math.min(ans, nums[mid]);
            if(nums[mid] >= nums[low]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}