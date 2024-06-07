class Solution {
    public int maxProfit(int[] prices) {
        
        int ans = 0;
        int buyPrice = prices[0];
        int n = prices.length;

        for(int i = 1; i < n; i++){
            if(prices[i] <= buyPrice)
                buyPrice = prices[i];
            else
                ans = Math.max(ans, prices[i] - buyPrice);
        }

        return ans;
    }
}