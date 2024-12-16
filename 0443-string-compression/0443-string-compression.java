class Solution {
    public int compress(char[] chars) {
        
       
        int i = 0;
        int indx = 0;

        while(i < chars.length){
            
            char currChar = chars[i];
            int len = 0;
            while(i < chars.length && chars[i] == currChar){
                i++;
                len++;
            }
            
            chars[indx++] = currChar;
            if(len > 1){
                for(char c : String.valueOf(len).toCharArray())
                    chars[indx++] = c;
            }
        }

        return indx;
    }
}