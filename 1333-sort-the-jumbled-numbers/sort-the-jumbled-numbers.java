class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        
        List<int[]> pairs = new ArrayList<>();

        int i = 0;
        for(int num : nums){
            String number = Integer.toString(num);
            StringBuilder mapped = new StringBuilder();

            for(char ch : number.toCharArray()){
                mapped.append(mapping[ch-'0']);
            }

            int mappedResult = Integer.parseInt(mapped.toString());
            pairs.add(new int[]{mappedResult, i});
            i++;
        }

        pairs.sort((a,b) -> Integer.compare(a[0], b[0]));


        int[] res = new int[nums.length];
        for(int j = 0; j < nums.length; j++){
            res[j] = nums[pairs.get(j)[1]];
        }

        return res;
    }
}