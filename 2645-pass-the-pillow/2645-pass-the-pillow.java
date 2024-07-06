class Solution {
    public int passThePillow(int n, int time) {
        
        int currPos = 1, dir = 1;

        for(int i = 1; i <= time; i++){
            
            currPos += dir;
            if(currPos == n || currPos == 1)
                dir *= -1;
        }
        return currPos;
    }
}