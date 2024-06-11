class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] ans = new int[n1];

        int itr = 0;
        for(int i : arr2){
            for(int j = 0; j < n1; j++){
                if(arr1[j] == i){
                    ans[itr] = i;
                    itr++;
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);

        for(int i : arr1){
            if(i != -1){
                ans[itr] = i;
                itr++;
            }
        }

        return ans;
    }
}