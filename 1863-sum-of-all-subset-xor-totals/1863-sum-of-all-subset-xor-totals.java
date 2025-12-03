class Solution {
    public int subsetXORSum(int[] nums) {
        
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        
        int sum = 0;
        for(List<Integer> subset : subsets){
            int xorTotal = 0;
            for(int num : subset)
                xorTotal ^= num;

            sum += xorTotal;
         }

         return sum;
    }

    public void generateSubsets(int[] nums, int indx, List<Integer> subset, List<List<Integer>> subsets){
        if(indx == nums.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[indx]);
        generateSubsets(nums, indx+1,subset, subsets);
        
        subset.remove(subset.size()-1);
        generateSubsets(nums, indx+1,subset, subsets);

    }
}