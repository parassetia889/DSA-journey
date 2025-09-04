class Solution {
    public int maxProfit(int[] prices) {
        
        int cp = prices[0], profit = 0;
        for(int i : prices){
            if(i > cp)
                profit = Math.max(profit, i-cp);
            else
                cp = i;
        }
        return profit;
    }
}