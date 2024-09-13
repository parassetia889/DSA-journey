class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int n = queries.length;
        int[] res = new int[n];

        int j = 0;
        for(int[] query : queries){
            int start = query[0], end = query[1];
            int xor = 0;
            for(int i = start; i <= end; i++){
                xor ^= arr[i];
            }
            res[j] = xor;
            j++;
        }

        return res;

    }
}