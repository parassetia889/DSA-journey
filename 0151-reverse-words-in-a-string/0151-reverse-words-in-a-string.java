class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.trim().split(" ");

        String rev = "";
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != "")
                rev += arr[i]+" ";
        }

        return rev.trim();
    }
}