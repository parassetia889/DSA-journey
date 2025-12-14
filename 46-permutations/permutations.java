class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        backTrack(nums, 0, res);
        return res;
    }

    public void backTrack(int[] nums, int indx, List<List<Integer>> res){
        if(indx >= nums.length){
            res.add(Arrays.stream(nums).boxed().toList());
            return;
        }

        for(int i=indx; i<nums.length; i++){
            swap(nums, i, indx);
            backTrack(nums, indx+1, res);
            swap(nums, indx, i);
                
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}