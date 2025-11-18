class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0, left=0;
        Set<Character> seen = new HashSet<>();

        for(int right=0; right < s.length(); right++){
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