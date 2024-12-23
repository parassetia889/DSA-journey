class Solution {
    public int characterReplacement(String s, int k) {
        
        if(s.length() <= 1)
            return s.length();

        int maxFreq = 0, maxLen = 0;
        int start = 0, end = 0;
        int[] freq = new int[26];

        while(end < s.length()){
            char ch = s.charAt(end);

            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq, freq[ch-'A']);

            int replacements = (end-start+1)-maxFreq;
            if(replacements > k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            maxLen = Math.max(maxLen, (end-start+1));
            end++;
        }
        return maxLen;
    }
}