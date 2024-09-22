class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        int n = nums1.length, m = nums2.length;

        while(i < n && j < m){
            if(nums1[i] == nums2[j] && !list.contains(nums1[i])){
                list.add(nums1[i]);
                i++; j++;
            }
            else if(nums1[i] < nums2[j])
                i++;
            else
                j++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}