class Solution {
    public int[] getConcatenation(int[] nums) {

     int n = nums.length;
     int[] res = new int[n*2];
    
     int j=0;
     for(int i=0; i <n; i++){
        res[j] = nums[i];
        res[j+n] = nums[i];
        j++;
     }   
     return res;
    }
}