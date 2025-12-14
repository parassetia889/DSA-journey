class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        boolean[] pick = new boolean[nums.length];

        backTrack(nums, new ArrayList<>(), pick, res);
        return res;
    }

    public void backTrack(int[] nums, List<Integer> curr, boolean[] pick, List<List<Integer>> res){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!pick[i]){
                pick[i] = true;
                curr.add(nums[i]);
                backTrack(nums, curr, pick, res);
                curr.remove(curr.size()-1);
                pick[i]=false;
            }
        }
    }
}