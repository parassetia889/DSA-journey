class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] arr = new int[]{-1,-1};

        arr[0] = firstOccurence(nums, target);
        arr[1] = lastOccurence(nums, target);

        return arr;
    }

    public static int firstOccurence(int[] nums, int target){
        int s = 0, e = nums.length-1;

        int ans = -1;
        while(s <= e){
            int mid = (s+e)/2;

            if(nums[mid] == target){
                ans = mid;
                e = mid-1;
            }
            else if(nums[mid] > target)
                e = mid-1;
            else
                s = mid+1;
        }
        return ans;
    }

    public static int lastOccurence(int[] nums, int target){
    int s = 0, e = nums.length-1;

        int ans = -1;
        while(s <= e){
            int mid = (s+e)/2;

            if(nums[mid] == target){
                ans = mid;
                s = mid+1;
            }
            else if(nums[mid] > target)
                e = mid-1;
            else
                s = mid+1;
        }
        return ans;
    }
}