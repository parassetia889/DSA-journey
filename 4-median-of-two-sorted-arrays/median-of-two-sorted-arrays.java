class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double median = 0;
        int n = nums1.length;
        int m = nums2.length;
        
        int[] arr = new int[m+n];
        int i = 0, j = 0, k = 0;
        
        while(i<n && j < m){
            
            if(nums1[i] < nums2[j])
                arr[k++] = nums1[i++];
            else
                arr[k++] = nums2[j++];
        }
        
        while(i < n && k < arr.length)
            arr[k++] = nums1[i++];
        
         while(j < m)
            arr[k++] = nums2[j++];
        
        if(arr.length %2 == 1){
            median = arr[arr.length/2];
        }
        // If total elements are EVEN
        else{
            median = (double)(arr[(arr.length/2) - 1] + arr[arr.length/2])/2;
        }
        return median;
    }
}