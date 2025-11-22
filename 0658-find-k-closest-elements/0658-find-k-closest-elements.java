class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int right = binarySearch(arr, x);
        int left = right-1;
        int n = arr.length;

        while(k > 0){
            if(left < 0)
                right++;
            else if(right >= n )
                left--;
            else{
                if(Math.abs(arr[left]-x) <= Math.abs(arr[right]-x))
                    left--;
                else
                    right++;
            }

            k--;
        }

        List<Integer> res = new ArrayList<>();
        for(int i = left+1; i < right; i++){
            res.add(arr[i]);
        }

        return res;
    }

    public int binarySearch(int[] arr, int x){
        int left = 0, right = arr.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(arr[mid] >= x)
                right = mid-1;
            else
                left = mid+1;
        }

        return left;
    }
}