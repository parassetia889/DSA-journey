class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        
        List<Integer> map = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x)
                map.add(i);
        }

        int ans[] = new int[queries.length];

        for(int j = 0; j < queries.length; j++){
            int val = queries[j];
            
            ans[j] = val <= map.size() ? map.get(val-1) : -1;
        }

        return ans;

    }
}