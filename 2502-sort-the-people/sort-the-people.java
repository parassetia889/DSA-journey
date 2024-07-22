class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer, String> heightsToNames = new HashMap<>();

        int n = names.length;
        for(int i = 0; i < n; i++){
            heightsToNames.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        String[] sortedArray = new String[n];
        for(int i = n-1; i>= 0; i--){
            sortedArray[n-i-1] = heightsToNames.get(heights[i]);
        }

        return sortedArray;
    }
}