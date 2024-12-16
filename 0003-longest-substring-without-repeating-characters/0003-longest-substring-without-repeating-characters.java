class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() <= 1)
            return s.length();


        int start = 0, end = 0;
        int maxLen = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();

        while(end < s.length()){
            char ch = s.charAt(end);
            if(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
                // set.remove(ch);
                // maxLen = Math.max(maxLen, end-start+1);
            }else{
                set.add(ch);
                end++;
                
                }
                maxLen = Math.max(maxLen, set.size());
        }

            return maxLen;
    }
}