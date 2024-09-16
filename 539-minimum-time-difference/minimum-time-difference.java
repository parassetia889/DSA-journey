class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();

        for(String str : timePoints){
            int hh = Integer.parseInt(str.substring(0,2));
            int mm = Integer.parseInt(str.substring(3));

            minutes.add(hh*60 + mm);
        }
        Collections.sort(minutes);

        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < minutes.size()-1; i++){
            minDiff = Math.min(minDiff, minutes.get(i+1)-minutes.get(i));
        }

         return Math.min(
            minDiff,
            24 * 60 - minutes.get(minutes.size()-1) + minutes.get(0));
    }
}