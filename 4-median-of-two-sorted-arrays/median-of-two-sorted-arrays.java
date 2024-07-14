class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int newArr[] = new int[m+n];
        int i = 0, j = 0, k = 0;
        double median = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                newArr[k] = nums1[i];
                i++; k++;
            }
            else{
                newArr[k] = nums2[j];
                j++; k++;
            }
        }   

        while(i < m && k < newArr.length){
            newArr[k] = nums1[i];
            i++; k++;
        }

        while(j < n && k < newArr.length){
            newArr[k] = nums2[j];
            j++; k++;
        }

        if(newArr.length%2 != 0)
            median = newArr[newArr.length/2];
        else{
            int val1 = newArr[newArr.length/2];
            int val2 = newArr[(newArr.length/2) - 1];
            median = (val1+val2)/2.0;

            // median = (double)(newArr[(newArr.length/2) - 1] + newArr[newArr.length/2])/2;
        }

        return median;
    }
}