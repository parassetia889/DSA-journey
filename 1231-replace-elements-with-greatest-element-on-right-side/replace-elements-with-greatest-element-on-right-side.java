class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;
        int max = arr[n-1];
        

        for(int i = n-2; i >= 0; i--){
            int val = arr[i];
            arr[i] = max;
            if(val > max)
                max = val;

        }
        arr[n-1] = -1;
        return arr;
    }
}