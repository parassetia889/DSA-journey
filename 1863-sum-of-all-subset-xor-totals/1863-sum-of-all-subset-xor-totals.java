class Solution {
    public int subsetXORSum(int[] nums) {
        
        return XORSum(nums, 0, 0);
    }

    public int XORSum(int[] nums, int indx, int currXor){
        if(indx == nums.length){
            return currXor;
        }

        int with = XORSum(nums, indx+1, currXor ^ nums[indx]);
        int withOut = XORSum(nums, indx+1, currXor);

        return with + withOut;

    }
}