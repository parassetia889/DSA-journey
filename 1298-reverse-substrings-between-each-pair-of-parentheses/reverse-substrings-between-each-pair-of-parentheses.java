class Solution {
    public String reverseParentheses(String s) {
        
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        int[] pair = new int[n];

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch =='(')
                stack.push(i);
            else if(ch ==')'){
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int currIndx = 0, dir = 1; currIndx < n; currIndx += dir){
            
            if(s.charAt(currIndx) == '(' || s.charAt(currIndx) == ')'){
                dir *= -1;
                currIndx = pair[currIndx];
            }
            else
                sb.append(s.charAt(currIndx));
        }

        return sb.toString();
    }
}