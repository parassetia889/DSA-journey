class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);

        return res;
    }

    public int findFirst(int[] nums, int target){
        int pos = -1;
        
        int low = 0, high = nums.length-1;
        while(low <= high){

            int mid = (low+high)/2;

            if(nums[mid] == target){
                pos = mid;
                high = mid-1;
            }else if(nums[mid] < target)
                low = mid+1;
            else{
                high = mid-1;
            }
        }
        return pos;
    }

    public int findLast(int[] nums, int target){
        int pos = -1;
        
        int low = 0, high = nums.length-1;
        while(low <= high){

            int mid = (low+high)/2;

            if(nums[mid] == target){
                pos = mid;
                low = mid+1;
            }else if(nums[mid] < target)
                low = mid+1;
            else{
                high = mid-1;
            }
        }
        return pos;
    }
}