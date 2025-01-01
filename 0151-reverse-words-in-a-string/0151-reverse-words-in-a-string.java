class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.trim().split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != "")
                sb.append(arr[i]+" ");
        }

        return sb.toString().trim();
    }
}