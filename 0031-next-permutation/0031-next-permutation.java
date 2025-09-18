class Solution {
    public void nextPermutation(int[] nums) {
        
        int indx = -1, n = nums.length;

        for(int i=n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                indx = i;
                break;
            }
        }

        if(indx == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i = n-1; i >= 0; i--){
            if(nums[i] > nums[indx]){
                swap(nums, i, indx);
                break;
            }
        }
        reverse(nums, indx+1, n-1);
    }

    public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int nums[], int i, int j){
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}