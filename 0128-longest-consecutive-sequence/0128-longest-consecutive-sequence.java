class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length <= 1)
            return nums.length;

        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);

        int count = 0, maxLen = 0;
        for(int i : nums){
            if( !set.contains(i-1)){
                count = 1;
                int x = i;

                while(set.contains(x+1)){
                    count++;
                    x += 1;
                }

                maxLen = Math.max(count, maxLen);
            }
        }

        return maxLen;
    }
}