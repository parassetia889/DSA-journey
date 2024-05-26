class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        int xor = 0;

        int[] arr = new int[51];

        for(int i : nums)
            arr[i]++;

        for(int i = 1; i < 51; i++)
            if(arr[i] == 2)
                xor ^= i;

        return xor;
    }
}