class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        int i = 1, n = intervals.length;

        while(i < n){
            int[] interval = res.get(res.size()-1);

            if(interval[1] >= intervals[i][0]){
                int start = Math.min(interval[0], intervals[i][0]);
                int end = Math.max(interval[1], intervals[i][1]);

                res.add(new int[]{start, end});
                res.remove(interval);
            }else{
                res.add(intervals[i]);
            }
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}