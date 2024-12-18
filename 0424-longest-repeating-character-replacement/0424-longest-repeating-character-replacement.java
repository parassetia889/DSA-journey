class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxLen = 0;
        int left = 0, right = 0;
        int[] charCount = new int[26];

        int maxFreq = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            charCount[ch-'A']++;
            maxFreq = Math.max(maxFreq, charCount[ch-'A']);

            int windowSize = right-left+1;
            int replacements = windowSize-maxFreq;
            if(replacements > k){
                charCount[s.charAt(left)-'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
            return maxLen;
    }
}