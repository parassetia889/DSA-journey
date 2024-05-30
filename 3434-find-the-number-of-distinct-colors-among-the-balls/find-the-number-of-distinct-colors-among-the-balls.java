class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>();

        int ans[] = new int[queries.length];
        int i = 0;
        for(int[] query : queries){
            int ball = query[0];
            int color = query[1];

            if(ballToColor.containsKey(ball)){

                int existingColor = ballToColor.get(ball);
                colorCount.put(existingColor, colorCount.get(existingColor)-1);
                if(colorCount.get(existingColor) == 0)
                    colorCount.remove(existingColor);
            }

            ballToColor.put(ball, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0)+1);

            ans[i++] = colorCount.size();
        }
        return ans;
    }
}