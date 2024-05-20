class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] merged = new int[m+n];

        int i = 0, n1 = 0, n2 = 0;
        while(n1 < m && n2 < n){

            if(nums1[n1] < nums2[n2])
                merged[i++] = nums1[n1++];
            else
                merged[i++] = nums2[n2++];
        }

        while(n1 < m)
            merged[i++] = nums1[n1++];
        
        while(n2 < n)
            merged[i++] = nums2[n2++];


        for(int ind = 0; ind < m+n; ind++)
            nums1[ind] = merged[ind];

    }
}