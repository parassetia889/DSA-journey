class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int size = allowed.length();
        int res = 0;
    
        for(String word : words){
            boolean isConsistent = true;
            for(char ch : word.toCharArray()){
                if(allowed.indexOf(ch) == -1){
                    isConsistent = false;
                    break; }
            }
            if(isConsistent)
                res++;
        }

        return res;
    }
}