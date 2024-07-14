class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int len = m+n;

        int indx2 = len/2, indx1 = len/2-1;
        int ind1ele = -1, ind2ele = -1;

        int cnt = 0;
        int i = 0,  j =  0, k = 0;
        double median = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                if(cnt == indx1)
                    ind1ele = nums1[i];
                if(cnt == indx2)
                    ind2ele = nums1[i];
                i++; cnt++;
            }
            else{
                if(cnt == indx1)
                    ind1ele = nums2[j];
                if(cnt == indx2)
                    ind2ele = nums2[j];
                j++; cnt++;
            }

            // if(ind1ele != -1 && ind2ele != -1)
            //     break;
        }   

        while(i < m ){
           if(cnt == indx1)
                ind1ele = nums1[i];
            if(cnt == indx2)
                ind2ele = nums1[i];
            i++; cnt++;
        }

        while(j < n){
           if(cnt == indx1)
                ind1ele = nums2[j];
            if(cnt == indx2)
                ind2ele = nums2[j];
            j++; cnt++;
        }

        if(len%2 != 0)
            median = ind2ele;
        else
            median = (ind1ele+ind2ele)/2.0;

        return median;
    }
}