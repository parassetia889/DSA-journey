class Solution {
    public String reverseParentheses(String s) {
        
        StringBuilder res = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(')
                st.push(res.length());
            else if(ch == ')'){
                int startIndx = st.pop();
                reverse(res, startIndx, res.length()-1);
            }
            else
                res.append(ch);
        }
        return res.toString();
    }

    private static void reverse(StringBuilder sb, int start, int end){

        while(start < end){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++; end--;
        }
    }
}