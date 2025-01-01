class Solution {
    public int maxScore(String s) {
        
        int ones = 0, zeros = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1')
                ones++;
            else
                zeros++;
        }

        int lScore = 0, rScore = ones, totalScore=0;
        for(int i = 0; i < s.length()-1; i++){
            char ch = s.charAt(i);
            if(ch == '1')
                rScore--;
            else
                lScore++;

            totalScore = Math.max(totalScore, rScore+lScore);
        }

        return totalScore;

    }
}