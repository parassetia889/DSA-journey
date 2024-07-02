class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int freq[] = new int[1001];
        int res[] = new int[1001];

        for(int i : nums1){
            freq[i]++;
        }

        int counter = 0;
        for(int i : nums2){
            if(freq[i] > 0){
                res[counter++] = i;
                freq[i]--;
            }
        }

        return Arrays.copyOfRange(res, 0, counter);
        
    }
}