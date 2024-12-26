class Solution {
    public int maxArea(int[] height) {
        
        
        int max = Integer.MIN_VALUE;
        int i = 0 , j = height.length-1;
        
        while(i < j){
            int water = (j-i)*Math.min(height[i], height[j]);
                max = Math.max(max, water);
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
       
        return max;
    }
}