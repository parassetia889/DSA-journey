class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] arr = new int[]{-1,-1};

        arr[0] = findFirst(nums, target);
        arr[1] = findLast(nums, target);

        return arr;
    }

    public int findFirst(int[] nums, int target){

        int n = nums.length;
        int low = 0, high = n-1;
        int ans = -1;

        while(low <= high){

            int mid = (low+high)/2;

            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            }else if(nums[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return ans;

    }

    public int findLast(int[] nums, int target){
        
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = -1;

        while(low <= high){

            int mid = (low+high)/2;

            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }else if(nums[mid] < target){
                low = mid+1;
            }else
                high = mid-1;
        }
        return ans;
    }
}