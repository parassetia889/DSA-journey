class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums.length == k)
            return nums;

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> map.get(n1) - map.get(n2)
        );

        for(int i : map.keySet()){
            heap.add(i);
        }

        
        while(heap.size() >  k){
            heap.poll();
        }

        int i = 0;
        int[] res = new int[k];
        while( !heap.isEmpty()){
            res[i] = heap.poll();
            i++;
        }

        return res;
    }
}