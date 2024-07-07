class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int consumed = 0;

        while(numBottles >= numExchange){

            int k = numBottles/numExchange;
            consumed += numExchange*k;

            numBottles = numBottles - numExchange*k + k;
        }

        return numBottles+consumed;
    }
}