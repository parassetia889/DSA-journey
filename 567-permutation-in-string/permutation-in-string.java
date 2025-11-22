class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length())
            return false;

        s1 = sort(s1);

        for(int i = 0; i <= s2.length()-s1.length(); i++){
            String substr = s2.substring(i, i+s1.length());

            if(sort(substr).equals(s1)){
                return true;
            }
        }
        return false;
    }

    public String sort(String str){
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        return new String(strArr);
    }
}