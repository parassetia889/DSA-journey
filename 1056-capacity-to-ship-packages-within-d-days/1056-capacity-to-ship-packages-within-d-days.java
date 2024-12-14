class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        
        int low = 0, high = 0;

        for(int weight : weights){
            high += weight;
            low = Math.max(low,weight);
        }
        int ans = high;

        while(low <= high){

            int mid = (low+high)/2;
            int reqDays = getDaysNeeded(weights, mid);

            if(reqDays <= days){
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return ans;

    }

    public static int getDaysNeeded(int[] weights, int maxWt){

        int daysNeeded = 1;
        int currWeight = 0;

        for(int weight : weights){
            if(currWeight + weight <= maxWt)
                currWeight += weight;
            else{
                currWeight = weight;
                daysNeeded += 1;
            }
        }
        return daysNeeded;
    }
}