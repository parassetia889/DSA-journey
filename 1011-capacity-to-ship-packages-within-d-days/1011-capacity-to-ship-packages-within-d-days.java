class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int maxVal = weights[0], sum=0;
        for(int weight : weights){
            sum += weight;
            maxVal = Math.max(maxVal, weight);
        }

        int low = maxVal, high = sum;

        int ans = low;
        while(low <= high){
            int mid = (low+high)/2;

            int totalDays = getDays(weights, mid);
            if(totalDays <= days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public int getDays(int[] weights, int capacity){
        int totalDays = 1, currCapacity=0;

        for(int weight : weights){
            if(currCapacity+weight > capacity){
                totalDays += 1;
                currCapacity = 0;
            }

            currCapacity += weight;
        }
        return totalDays;
    }
}