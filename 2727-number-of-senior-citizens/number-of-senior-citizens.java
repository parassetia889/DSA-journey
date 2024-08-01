class Solution {
    public int countSeniors(String[] details) {
        
        int count = 0;
        for(String detail : details){
            StringBuilder sb = new StringBuilder();
            sb.append(detail.charAt(11));
            sb.append(detail.charAt(12));

            int age = Integer.parseInt(sb.toString());
            // System.out.println(age);
            if(age > 60)
                count++;
        }
        return count;
        
    }
}