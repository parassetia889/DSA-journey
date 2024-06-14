class Solution {
    public int heightChecker(int[] heights) {
        
        int n = heights.length;
        int[] expected = new int[n];

        int j = 0;
        for(int i : heights){
            expected[j] = i;
            j++;
        }

        Arrays.sort(expected);
        
        int count = 0;
        for(int i = 0; i < expected.length; i++){
            if(expected[i] != heights[i])
                count++;
        }

        return count;
    }
}