class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(nums, 0, res, new ArrayList<>());
        return res;
    }

    public void generateSubsets(int[] nums, int indx, List<List<Integer>> res, List<Integer> subset){
        if(indx >= nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[indx]);
        generateSubsets(nums, indx+1, res, subset);

        subset.remove(subset.size()-1);
        generateSubsets(nums, indx+1, res, subset);
    }
}