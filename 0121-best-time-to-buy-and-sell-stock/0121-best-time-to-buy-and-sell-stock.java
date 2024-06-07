class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0, n = prices.length;
        int cp = prices[0];

        for(int i = 1 ; i < n; i++){
            if(prices[i] < cp)
                cp = prices[i];
            else
                max = Math.max(prices[i]-cp, max);
        }

        return max;
    }
}