class Solution {
    public String largestNumber(int[] nums) {

     int n = nums.length;
     String[] strArr = new String[n];

     for(int i=0; i<n; i++){
        strArr[i] = String.valueOf(nums[i]);
     }   
     

     Arrays.sort(strArr, (a,b) -> (b+a).compareTo(a+b));
    if(strArr[0].equals("0"))
        return "0";
     StringBuilder sb = new StringBuilder();
     for(String str : strArr){
        sb.append(str);
     }

     return sb.toString();
    }
}