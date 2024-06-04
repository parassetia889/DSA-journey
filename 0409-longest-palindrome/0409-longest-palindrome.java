class Solution {

    public int longestPalindrome(String s) {
        // Map to store frequency of occurrence of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        // Count frequencies
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        boolean hasOddFrequency = false;
        for (int freq : frequencyMap.values()) {
            if ((freq % 2) == 0) {
                res += freq;
            } else {
                
                res += freq - 1;
                hasOddFrequency = true;
            }
        }
    
        if (hasOddFrequency) return res + 1;

        return res;
    }
}