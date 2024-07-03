class Solution {

    public static boolean getDivSum(int[] nums, int div, int threshold){

        int sum = 0;
        for(int num : nums){
            sum += Math.ceil((float)num/div);
        }
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        
        int n = nums.length;

        int low = 1, high = 0, smallestDiv = -1;

        for(int num : nums)
            high = Math.max(high, num);

        while(low <= high){
            
            int mid = (low + high)/2;

            if(getDivSum(nums, mid, threshold)){
                smallestDiv = mid;
                high = mid-1;
            }else
                low = mid+1;
        }

        return smallestDiv;
    }
}