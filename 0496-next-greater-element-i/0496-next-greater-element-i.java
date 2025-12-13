class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }

            int nextGreat = stack.isEmpty() ? -1 : stack.peek();
            map.put(nums2[i], nextGreat);
            stack.push(nums2[i]);

        }

        int[] res = new int[nums1.length];
        int i=0;
        for(int num : nums1){
            res[i++] = map.get(num);
        }
        return res;
    }
}