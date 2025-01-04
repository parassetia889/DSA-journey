class Solution {
    public int maxArea(int[] height) {
        
        int i = 0, j = height.length-1;
        int ans = Integer.MIN_VALUE;

        while(i < j){
            int water = Math.min(height[j], height[i])*(j-i);
            ans = Math.max(ans, water);
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}