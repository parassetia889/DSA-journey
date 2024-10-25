class Solution {

    public static int getHours(int rate, int[] piles){
        int hrs = 0;

        for(int pile : piles){
            hrs += Math.ceil((double)pile/rate);
        }

        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;

        for(int i : piles)
            max = Math.max(i, max);

        int low = 1, high = max, ans = -1;

        while(low <= high){
            int mid = (low+high)/2;

            int hrs = getHours(mid, piles);
            if(hrs <= h){
                ans = mid;
                high = mid-1;
                }
            else
                low = mid+1;

        }
        return ans;
    }
}