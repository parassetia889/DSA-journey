class Solution {
    public int findTheLongestSubstring(String s) {
        
        int prefixXor = 0;
        int[] characterMap = new int[26];
        characterMap['a'-'a'] = 1;
        characterMap['e'-'a'] = 2;
        characterMap['i'-'a'] = 4;
        characterMap['o'-'a'] = 8;
        characterMap['u'-'a'] = 16;

        int map[] = new int[32];
        int longest = 0;
        Arrays.fill(map, -1);

        for(int i = 0; i < s.length(); i++){
            prefixXor ^= characterMap[s.charAt(i)-'a'];
            if(map[prefixXor] == -1 && prefixXor != 0)
                map[prefixXor] = i;

                longest = Math.max(longest, i-map[prefixXor]);
        }

        return longest;
    }
}