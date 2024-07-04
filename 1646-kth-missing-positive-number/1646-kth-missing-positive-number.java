class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        if(k < arr[0])
            return k;

        for(int i : arr){
            if(i <= k)
                k++;
            else
                break;
        }
        return k;
    }
}