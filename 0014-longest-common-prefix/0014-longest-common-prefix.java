class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0)
            return "";
        
        if(strs.length == 1)
            return strs[0];


        Arrays.sort(strs);
        int n = strs.length;
        int N = Math.min(strs[0].length(), strs[n-1].length());

        for(int i = 0 ; i < N; i++){
            if(strs[0].charAt(i) != strs[n-1].charAt(i)){
                return strs[0].substring(0,i);
            }
        }

        return strs[0];
    }
}