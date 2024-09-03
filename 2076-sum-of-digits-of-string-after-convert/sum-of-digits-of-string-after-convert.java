class Solution {
    public int getLucky(String s, int k) {
        
        String convStr = "";
        for(char ch : s.toCharArray()){
            convStr += (ch-'a' +1);
        }

        
        while(k-- > 0){
            int sum = 0;
            for(char ch : convStr.toCharArray()){
                sum += ch-'0';
            }

            convStr = Integer.toString(sum);
        }

        return Integer.parseInt(convStr);

    }
}