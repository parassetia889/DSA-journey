class Solution {
    public int passThePillow(int n, int time) {
        
        int currTime = 0, currPos = 1, direction = 1;

        while(currTime < time){
            if(currPos+direction > 0 && currPos + direction <= n){
            currPos += direction;
            currTime++;
            }
            else
                direction = -1;
        }

        return currPos;   
    }
}