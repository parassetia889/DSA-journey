class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int count=1, max=1, curr=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == curr)
                continue;
            else if(nums[i] == curr+1){
                curr=nums[i];
                count++;
                }
            else{
                curr=nums[i];
                count=1;
}
            max=Math.max(count, max);
            
        }
        return max;
    }
}