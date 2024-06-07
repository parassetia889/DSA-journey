class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int res[] = new int[nums.length];
        int pro = 1, count = 0;

        for(int i : nums){
            if(i == 0)
                count++;
            else
                pro *= i;
            }
        if(count > 1)
            return res;

        for(int i = 0; i < nums.length; i++){
            if(count == 0)
                res[i] = pro/nums[i];
            else{
                if(nums[i] == 0)
                    res[i] = pro;
                else
                    res[i] = 0;
            }
        }
            

        return res;
    }
}