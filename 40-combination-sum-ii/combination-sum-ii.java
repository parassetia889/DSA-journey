class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates, 0, target, res, new ArrayList<>());

        return res;

    }

    public void findCombination(int[] nums, int indx, int target, List<List<Integer>> res, List<Integer> curr){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(target<0 || indx >= nums.length)
            return;

        curr.add(nums[indx]);
        findCombination(nums, indx+1, target-nums[indx], res, curr);

        curr.remove(curr.size()-1);
        while(indx+1  < nums.length && nums[indx] == nums[indx+1])
            indx++;

        findCombination(nums, indx+1, target, res, curr);
    }
}