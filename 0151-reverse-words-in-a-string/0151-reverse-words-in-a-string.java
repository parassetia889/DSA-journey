class Solution {
    public String reverseWords(String s) {
        
        Stack<String> st = new Stack<>();
        s = s.trim();

        for(String str : s.split("\\s+")){
            st.push(str);
        }

        StringBuilder sb = new StringBuilder();
        while( !st.isEmpty()){
            sb.append(st.pop()+" ");
        }

        return sb.toString().trim();
    }
}