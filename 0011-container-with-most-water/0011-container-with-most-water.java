class Solution {
    public int maxArea(int[] height) {
        
        int l = 0, r = height.length-1;
        int max = Integer.MIN_VALUE;

        while(l < r){
            int water = Math.min(height[l], height[r]) *  (r-l);
            max = Math.max(max, water);

            if(l < r)
                l++;
            else
                r--;
        }
        return max;
    }
}