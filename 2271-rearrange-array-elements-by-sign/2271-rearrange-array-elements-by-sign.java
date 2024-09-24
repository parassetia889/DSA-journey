class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        
        int[] ans = new int[n];

        int posIndex = 0, negIndex = 1;

        for (int i : nums) {
            if (i > 0) {
               
                ans[posIndex] = i;
                posIndex += 2;
            } else {
               
                ans[negIndex] = i;
                negIndex += 2;
            }
        }

        return ans;
    }
}