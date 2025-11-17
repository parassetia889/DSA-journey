class Solution {
    public int maxProfit(int[] prices) {
        
        int cp = prices[0], profit = 0;

        for(int indx=0; indx < prices.length; indx++){
            if(prices[indx] < cp)
                cp = prices[indx];
            
            else
                profit = Math.max(profit, prices[indx]-cp);
        }

        return profit;
    }
}