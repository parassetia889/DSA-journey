class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        Map<Integer, Integer> numRank = new HashMap<>();
        int[] nums = Arrays.copyOf(arr, arr.length);
        Arrays.sort(nums);

        int rank = 1;
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && nums[i] > nums[i-1])
                rank++;

            numRank.put(nums[i], rank);
        }


        for(int i = 0 ; i < nums.length; i++)
            arr[i] = numRank.get(arr[i]);

        return arr;
    }
}