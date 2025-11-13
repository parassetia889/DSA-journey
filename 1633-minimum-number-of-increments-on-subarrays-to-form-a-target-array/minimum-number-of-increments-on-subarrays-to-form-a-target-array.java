class Solution {
    public int minNumberOperations(int[] target) {
        
        int ops = target[0];

        for(int i = 1; i < target.length; i++){
            if(target[i] > target[i-1])
                ops += target[i]-target[i-1];
        }
        return ops;
    }
}

// target [1,2,3,2,1]
// initial [0,0,0,0,0]