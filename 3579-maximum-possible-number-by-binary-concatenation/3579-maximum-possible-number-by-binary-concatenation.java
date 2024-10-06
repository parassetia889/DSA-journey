class Solution {

    public static String toBinaryString(int num){
        return Integer.toBinaryString(num);
    }

    public int maxGoodNumber(int[] nums) {
        
        List<int[]> permutations = new ArrayList<>();
        generatePermutations(nums, 0, permutations);

        int max = 0;
        for(int[] permute : permutations){
            StringBuilder sb = new StringBuilder();

            for(int num : permute){
                sb.append(toBinaryString(num));
            }

            int concatenatedValue = Integer.parseInt(sb.toString(),2);

            max = Math.max(max, concatenatedValue);
        }
        return max;

    }

    public static void generatePermutations(int[] nums, int start, List<int[]> res){
        if(start == nums.length){
            res.add(nums.clone());
            return ;
        }

        for(int i = start; i< nums.length; i++){
            swap(nums, start, i);
            generatePermutations(nums, start+1, res);
            swap(nums, start, i);
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}