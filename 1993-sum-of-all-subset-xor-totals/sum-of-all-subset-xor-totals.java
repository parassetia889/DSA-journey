class Solution {
    public int subsetXORSum(int[] nums) {
        
        List<List<Integer>> subsets = new ArrayList<>();

        int result = 0;

        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        for(List<Integer> list: subsets){

            int XORTotal = 0;
            for(int i : list)
                XORTotal ^= i;

            result += XORTotal;

        }

        return result;
    }

    private static void generateSubsets(int[] nums, int ind, List<Integer> subset, List<List<Integer>> subsets){
        
        if(ind == nums.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[ind]);
        generateSubsets(nums, ind+1, subset, subsets);
        subset.remove(subset.size()-1);

        generateSubsets(nums, ind+1, subset, subsets);

    }
}