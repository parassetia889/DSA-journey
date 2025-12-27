class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> freqMap.get(b)-freqMap.get(a));

        for(int key : freqMap.keySet()){
            maxHeap.offer(key);
        }

        int[] res = new int[k];
        int i=0;
        while(k > 0){
            k--;
            res[i] = maxHeap.poll();
            i++;
        }

        return res;
    }
}