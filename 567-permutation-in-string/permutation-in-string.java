class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length())
            return false;

        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];

        for(char ch : s1.toCharArray()){
            freqS1[ch-'a']++;
        }

        int window = s1.length();
        for(int i = 0; i < window; i++){
            freqS2[s2.charAt(i)-'a']++;
        }

        if(matches(freqS1, freqS2))
            return true;

        for(int i = window; i < s2.length(); i++){
            freqS2[s2.charAt(i)-'a']++;
            freqS2[s2.charAt(i-window)-'a']--;

            if(matches(freqS1, freqS2))
            return true;
        }
        return false;
    }

    public boolean matches(int[] arr1, int[] arr2){

        for(int i=0; i < 26; i++){
            if(arr1[i] != arr2[i])
                return false;
        }

        return true;
    }
}