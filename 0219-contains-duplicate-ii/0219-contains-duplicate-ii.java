class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> seen = new HashSet<>();

        int left = 0;
        for(int right=0; right < nums.length; right++){
            if(seen.contains(nums[right]))
                return true;

            seen.add(nums[right]);
            if(seen.size() > k){
                seen.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}