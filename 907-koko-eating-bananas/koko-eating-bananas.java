class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int maxVal = 0;
        for(int pile : piles){
            maxVal = Math.max(pile, maxVal);
        }

        int left = 1, right = maxVal;
        int ans = left;
        
        while(left <= right){
            int mid = (left+right)/2;
            int hours = getHours(piles, mid);

            if(hours <= h){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }

    public int getHours(int[] piles, int speed){
        int totalHours = 0;

        for(int pile : piles){
            totalHours += Math.ceil((double)pile/speed);
        }

        return totalHours;
    }
}