class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i = nums2.length-1; i >= 0; i--){
            while( !st.isEmpty() && st.peek() <= nums2[i])
                st.pop();

            if(!st.isEmpty())
                map.put(nums2[i], st.peek());
            else
                map.put(nums2[i], -1);

            st.push(nums2[i]);
        }

        int j = 0;
        for(int num : nums1){
            nums1[j] = map.get(num);
            j++;
        }
        return nums1;
    }
}

// 4  -1
// 3 4
// 2 3
// 1 2