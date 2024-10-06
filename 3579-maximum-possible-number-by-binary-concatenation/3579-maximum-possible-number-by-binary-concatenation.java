class Solution {

    public static String toBinary(int num){
        return Integer.toBinaryString(num);
    }
    public int maxGoodNumber(int[] nums) {
        
        List<int[]> permutes = new ArrayList<>();
        generatePermutations(nums, 0, permutes);

        int max = 0;

        for(int[] perm : permutes){
            StringBuilder sb = new StringBuilder();

            for(int num : perm)
                sb.append(toBinary(num));

        int concatValue = Integer.parseInt(sb.toString(),2);

        max = Math.max(max, concatValue);
        }

        return max;
    }

    public static void generatePermutations(int[] nums, int start, List<int[]> res){
        if(start == nums.length){
            res.add(nums.clone());
            return;
        }

        for(int i = 0; i < nums.length; i++){
            swap(nums, start, i);
            generatePermutations(nums, start+1, res);
            swap(nums, start, i);
        }
        
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}