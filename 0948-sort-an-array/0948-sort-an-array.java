class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);

        return nums;
    }

    public static void mergeSort(int[] nums, int s, int e){

        if(s >= e)
            return;

        int mid = (e-s)/2 + s;

        //sort left part
        mergeSort(nums, s, mid);

        //sort right part
        mergeSort(nums, mid+1, e);

        merge(nums, s, e);
    }

    public static void merge(int[] nums, int s, int e){

        int mid = (e+s)/2;
        int l1 = mid-s+1;
        int l2 = e-mid;

        int[] first = new int[l1];
        int[] second = new int[l2];

        for(int i = 0; i < l1; i++)
            first[i] = nums[s+i];

        for(int i = 0 ; i < l2; i++)
            second[i] = nums[mid+1+i];

        //merging
        int ind1 = 0, ind2 = 0;
        int mainIndx = s;

        while(ind1 < l1 && ind2 < l2){
            if(first[ind1] < second[ind2])
                nums[mainIndx++] = first[ind1++];
            else
                nums[mainIndx++] = second[ind2++];
        }

        while(ind1 < l1)
            nums[mainIndx++] = first[ind1++];

        while(ind2 < l2)
            nums[mainIndx++] = second[ind2++];
    }
}