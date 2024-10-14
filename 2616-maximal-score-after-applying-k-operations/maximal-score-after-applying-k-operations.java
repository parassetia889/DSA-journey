class Solution {
    public long maxKelements(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums)
            pq.add(num);

        long ans = 0;
        while(k-- > 0){
            int ele = pq.poll();
            ans += ele;
            pq.add((int)Math.ceil(ele/3.0));
        }
        return ans;
    }
}