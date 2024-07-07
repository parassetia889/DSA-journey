class Solution {
    public static boolean canPlace(int[] position, int dis, int balls){
        int count = 1, last = position[0];

        for(int i = 1; i < position.length; i++){
            if(position[i]-last >= dis){
                count++;
                last = position[i];
            }

            if(count >= balls)
                return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        int n = position.length;

        int low = 1, high = position[n-1]-position[0];

        while(low <= high){
            int mid = (low+high)/2;

            if(canPlace(position, mid, m))
                low = mid+1;
            else
                high = mid-1;
        }
        return high;
    }
}