import java.util.*;
class Solution {
    
    public static List<String> list ;
        
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        printBalanceParenthesis(n,n,"");
        return list;
    }
    
    public static void printBalanceParenthesis(int open, int close, String output){
        
        if(close < open)
            return;
        
        if(open == 0 && close == 0){
            list.add(output);
            return ;
        }
        
        if(open > 0){
            String newString = output + "(";
            printBalanceParenthesis(open-1, close, newString);
        }
        
        if(close > 0){
            String newString = output + ")";
            printBalanceParenthesis(open, close-1, newString);
        }
    }
}