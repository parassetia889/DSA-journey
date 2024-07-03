class Solution {

    public static int getBouquets(int[] bloomDay, int day, int k){

        int count = 0;
        int numOfBouquets = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= day)
                count++;
            else{
                // numOfBouquets += count/k;
                count = 0;
            }
            if(count == k){
                count = 0;
                numOfBouquets++;
            }
        }
            return numOfBouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n = bloomDay.length;
        int low = 0, high = 0;

        for(int day : bloomDay){
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int minDays = -1;
        while(low <= high){

            int mid = (low+high)/2;
            int bouquet = getBouquets(bloomDay, mid, k);

            if(bouquet >= m){
                minDays = mid;
                high = mid-1;
            }else
                low = mid+1;
        }

        return minDays;
    }
}