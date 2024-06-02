class Solution {

    public int findGreaterThanOrEqual(int[] nums, int val){
     int start = 0, end = nums.length-1;
     int ind = nums.length;

     while(start <= end){
        int mid = (start+end)/2;

        if(nums[mid] >= val){
            end = mid-1;
            ind = mid;
        }
        else
            start = mid+1;
     }

     return ind;
    }
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i <= n; i++){
            int k = findGreaterThanOrEqual(nums, i);

            if(n-k == i)
                return i;
        }

        return -1;
    }
}