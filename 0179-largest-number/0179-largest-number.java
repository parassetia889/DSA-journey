class Solution {
    public String largestNumber(int[] nums) {
        
        String[] numStrings = new String[nums.length];

        int i = 0;
        for(int num : nums){
            numStrings[i] = Integer.toString(num);
            i++;
        }

        Arrays.sort(numStrings, (a,b) ->  (b+a).compareTo(a+b));
        if(numStrings[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for(String str : numStrings){
            sb.append(str);
        }

        return sb.toString();
    }
}