class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));

        int lastEnd = Integer.MIN_VALUE, count=0;

        for(int[] interval : intervals){
            if(interval[0] >= lastEnd){
                count++;
                lastEnd = interval[1];
          }
          
        }
        return intervals.length-count;
    }
}

// [1,11] [2,12] [11,22] [1,100]

