class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        
        long left = 0, right = (long) 1e18;

        while(left < right){
            long mid = left + (right-left)/2;

            if(canFinish(mountainHeight , workerTimes, mid))
                right = mid;
            else
                left = mid+1;
        }
        return left;
    }

    private boolean canFinish(int mountainHeight, int[] workerTimes, long maxTime){
        long reduced = 0;

        for(int time : workerTimes){
            long maxH = (long)(-1 +  Math.sqrt(1+8 * maxTime/time))/2;

            reduced += maxH;
            if(reduced >= mountainHeight)
                return true;
        }
        return reduced >= mountainHeight;
    }
}