class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int ans[] = new int[n*2];

        int i = 0;
        for(int num : nums){
            ans[i] = num;
            i++;
        }

        for(int j = 0; j < n; j++){
            ans[i] = nums[j];
            i++;
        }

        return ans;
    }
}