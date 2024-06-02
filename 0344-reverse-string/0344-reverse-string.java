class Solution {
    public void reverseString(char[] s) {
        
        int start = 0, end = s.length-1;

        reverse(s, 0, s.length-1);
    }

    public void reverse(char[] s, int left, int right){
        if( left >= right)
            return;

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

        reverse(s, left+1, right-1);
          

    }
}