class Solution {
    public int maxProfit(int[] prices) {
        
        int cp = prices[0], ans = 0;

        
        for(int i = 1; i < prices.length; i++){
            int price = prices[i];
            if(price < cp)
                cp = Math.min(cp, price);
            else
                ans = Math.max(ans, price-cp);
        }
        return ans;
    }
}