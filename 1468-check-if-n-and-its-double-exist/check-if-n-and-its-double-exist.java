class Solution {
    public boolean checkIfExist(int[] nums) {
        
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++)
            map.put(nums[i], i);

        for(int i = 0; i < n; i++){
            if(map.containsKey(2*nums[i]) && i != map.get(2*nums[i]))
                return true;

   
        }

        return false;
    }
}