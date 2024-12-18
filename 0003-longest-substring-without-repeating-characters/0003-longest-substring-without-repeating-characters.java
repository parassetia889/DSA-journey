class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() <= 1)
            return s.length();

        Set<Character> set = new HashSet<>();
        int max = 0;

        int start = 0, end = 0;

        for(char ch : s.toCharArray()){
            while( !set.isEmpty() && set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            end++;
            max = Math.max(max, set.size());
        }
    return max;
    }
}