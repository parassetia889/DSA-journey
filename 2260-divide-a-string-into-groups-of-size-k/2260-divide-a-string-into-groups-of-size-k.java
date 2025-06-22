class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        List<String> res = new ArrayList<>();

        int n = s.length();

        for(int i= 0; i < n; i+=k){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < i+k; j++){
                if(j < n)
                    sb.append(s.charAt(j));
                else 
                    sb.append(fill);
            }
            res.add(sb.toString());
        }

        return res.toArray(new String[0]);
        
    }
}