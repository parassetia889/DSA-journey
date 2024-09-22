class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        int n = nums.length;
        int[] ans = new int[n];

        int indx = 0;
        for(int i : nums){
            if( !set.contains(i) || set.isEmpty())
                ans[indx++] = i;
            
            set.add(i);
        }

        for(int i = 0; i < n; i++)
            nums[i] = ans[i];
        return set.size();
    }
}