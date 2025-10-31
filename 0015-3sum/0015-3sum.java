class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            Set<Integer> set = new HashSet<>();
            
            for(int j = i+1; j < nums.length; j++){
                int third = -(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    
                    Collections.sort(temp);
                    res.add(temp);

                }
                set.add(nums[j]);
            }
        }

        return new ArrayList<>(res);
    }
}