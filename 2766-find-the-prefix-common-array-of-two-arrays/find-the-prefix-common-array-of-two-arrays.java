class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;
        int[] c = new int[n];

        int count = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(set.contains(A[i]))
                count++;
           
            set.add(A[i]);

            if(set.contains(B[i]))
                count++;
            set.add(B[i]);
            c[i] = count;
        }
        return c;
    }
}

// 1 3  2

// 2