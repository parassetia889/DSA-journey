class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        s1 = sort(s1);
        for(int i = 0; i <= s2.length()-s1.length(); i++){
            if(s1.equals(sort(s2.substring(i, i+s1.length()))))
                return true;
        }

        return false;
    }

    public static String sort(String str){
        
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}