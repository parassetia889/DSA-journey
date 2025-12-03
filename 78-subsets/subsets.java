class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();

        generateSubsets(nums, res, 0, new ArrayList<>());
        return res;
    }

    public void generateSubsets(int[] nums, List<List<Integer>> res, int indx, List<Integer> subset){
        if(indx == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[indx]);
        generateSubsets(nums, res, indx+1, subset);
        
        subset.remove(subset.size()-1);
        generateSubsets(nums, res, indx+1, subset);
    }
}