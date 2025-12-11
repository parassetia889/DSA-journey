class Solution {
    public int[] getConcatenation(int[] nums) {

     int n = nums.length;
     int ans[] = new int[n*2];

     int i = 0;
     for(int num : nums){
        ans[i] = num;
        i++;
     }   

     int j = 0;
     while(j<n){
        ans[i] = nums[j];
        j++; i++;
     }

     return ans;
    }
}