class Solution {

    private int getFirstGreaterOrEqual(int[] nums, int val){
        int start = 0, end = nums.length-1;

        int ind = nums.length;
        while(start <= end){
            int mid = (end+start)/2;
            
            if(nums[mid] >= val){
                ind = mid;
                end = mid-1;
            }else
                start = mid + 1;
        }

        return ind;
    }

    public int specialArray(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 1; i <= n; i++){
            int k = getFirstGreaterOrEqual(nums, i);

            if(n-k == i)
                return i;
        }
        return -1;
    }
}