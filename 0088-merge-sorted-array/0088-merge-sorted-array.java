class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int end_indx = nums1.length-1;
        m -= 1;
        n -= 1;

        while(m >= 0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[end_indx] = nums1[m];
                m--;
            }else{
                nums1[end_indx] = nums2[n];
                n--;
            }
            end_indx--;
        }

        while(n >= 0){
            nums1[end_indx--] = nums2[n];
            n--;
        }
    }
}