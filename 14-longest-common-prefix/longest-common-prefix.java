class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0 || strs == null)
            return "";

        Arrays.sort(strs);

        String prefix = strs[0];
        int n = strs.length;
        while(strs[n-1].indexOf(prefix) != 0){
            prefix = prefix.substring(0, prefix.length()-1);
            if(prefix.length() == 0)
                return "";
        }

        return prefix;
    }
}