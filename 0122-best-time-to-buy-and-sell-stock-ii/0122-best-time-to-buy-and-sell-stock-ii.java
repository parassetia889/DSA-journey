class Solution {
    public int maxProfit(int[] prices) {

        int cp = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < cp)
                cp = prices[i];
            else{
                profit += prices[i]-cp;
                cp = prices[i];
            }
        }

        return profit;
    }
}