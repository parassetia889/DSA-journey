class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        if(nums.length <= 1)
            return nums.length;

        int maxLen = 1, count= 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == (nums[i-1]+1))
                count++;
            else{
                maxLen = Math.max(maxLen, count);
                count = 1;
            }}
            
        }

        return Math.max(maxLen, count);
    }

}
// 0 1 1 2
// 0 0 1 2 3 4 5 6 7 8 