class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1, high = -1;
        int sum = 0;
        for(int pile : piles){
            high = Math.max(high, pile);
            
        }

        high = sum;
        int ans = low;
        while(low <= high){

            int mid = (low+high)/2;
            int hrs = calculateDays(mid, piles);

            if(hrs <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public int calculateDays(int hourly, int[] piles){
        int totalH = 0;

        for(int pile : piles){
            totalH += Math.ceil((double)pile/hourly);
        }
        return totalH;
    }
}