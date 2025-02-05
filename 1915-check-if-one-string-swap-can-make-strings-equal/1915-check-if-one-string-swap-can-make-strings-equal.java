class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if( s1.equals(s2))
            return true;

        char[] s1Map = new char[26];
        char[] s2Map = new char[26];

        int diff = 0, n = s1.length();
        for(int i = 0 ; i < n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                diff++;
                s1Map[s1.charAt(i)-'a']++;
                s2Map[s2.charAt(i)-'a']++;
            }
            if(diff > 2)
                return false;
        }

        return Arrays.equals(s1Map, s2Map);
    }
}