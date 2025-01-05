class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() <= 1)
            return s.length();
            
        int ans = 1;
        int start = 0, end = 0;
        Set<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            while( !set.isEmpty() && set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            end++;
            ans = Math.max(ans, set.size());
        }

        return ans;
    }
}