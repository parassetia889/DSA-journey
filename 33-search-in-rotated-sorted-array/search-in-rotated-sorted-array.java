class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0, high = nums.length-1;

        while(low <= high){

        int mid = (low+high)/2;
        if(nums[mid] == target)
            return mid;
        if(nums[mid] <= nums[high]){
            if(target <= nums[high] && target >= nums[mid])
                low = mid+1;
            else
                high = mid-1;
            }
        else{
            if(target >= nums[low] && target <= nums[mid] )
                high = mid-1;
            else
                low = mid+1;
            }

        }
        return -1;
    }
}