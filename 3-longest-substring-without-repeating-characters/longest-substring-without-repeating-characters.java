class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> seen  = new HashSet<>();
        int left = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(seen.contains(ch)){
                while(seen.contains(ch)){
                    seen.remove(s.charAt(left));
                    left++;
                }
            }

            seen.add(ch);
            maxLen = Math.max(maxLen, seen.size());

        }

        return maxLen;
    }
}