class Solution {
    public int minLength(String s) {
        
        while(s.contains("AB") || s.contains("CD")){
            
            if(s.contains("AB")){
                int indx = s.indexOf("AB");
                if(indx == 0)
                    s = s.substring(indx+2);
                else
                    s = s.substring(0, indx) + s.substring(indx+2);
            }
            else{
                int indx = s.indexOf("CD");
                if(indx == 0)
                    s = s.substring(indx+2);
                else
                    s = s.substring(0, indx) + s.substring(indx+2);
            }
            
        }

        return s.length();
    }
}