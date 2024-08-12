class KthLargest {
    int k;
    List<Integer> stream;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        stream = new ArrayList<>(nums.length);

        for(int num : nums)
            stream.add(num);

        Collections.sort(stream);

    }
    
    public int add(int val) {
        int indx = getIndex(val);

        stream.add(indx, val);
        return stream.get(stream.size()-k);
    }

    private int getIndex(int val){
        int s = 0, e = stream.size()-1;

        while(s <= e){
            int mid = (s+e)/2;
            
            int midValue = stream.get(mid);
            if(midValue == val)
                return mid;
            else if(midValue > val)
                e =  mid-1;
            else 
                s =  mid+1;
        }
        return s;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */