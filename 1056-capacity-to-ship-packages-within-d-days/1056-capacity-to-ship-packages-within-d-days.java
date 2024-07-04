class Solution {

    public static boolean checkWeight(int[] weights, int capacity, int days){
        int dayRequired = 1;

        int currWeight = 0 ;
        for(int weight : weights){
            if(currWeight + weight <= capacity)
                currWeight += weight;
            else{
                dayRequired++;
                currWeight = weight;
            }

        }

        return dayRequired <= days;

    }

    public int shipWithinDays(int[] weights, int days) {
        
        int low = 0, high = 0;
        
        for(int weight : weights){
            low = Math.max(low, weight);
            high += weight;
        }

        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;

            if(checkWeight(weights, mid, days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}