class Solution {

    public boolean check(String str, int i, int j){
            int left = i, right = j;

            while(left < right){
                if(str.charAt(left) != str.charAt(right))
                    return false;
                left++; right--;
            }
            return true;
        }

    public String longestPalindrome(String s) {

        String ans = "";
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(check(s, i, j)){
                    int currLen = j-i+1;
                    if(currLen > maxLen){
                    ans =  s.substring(i,j+1);
                    maxLen = currLen;
                    }
                    
                }
            }
        }
        return ans;
    }
}