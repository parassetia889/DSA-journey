class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int n1 = arr1.length;
        int n2 = arr2.length;

        List<Integer> res = new ArrayList<>();
        List<Integer> remaining = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr2)
            map.put(i,0);

        for(int val : arr1){
            if(map.containsKey(val))
                map.put(val, map.get(val)+1);
            else
                remaining.add(val);
        }

        Collections.sort(remaining);

        for(int val : arr2){
            for(int j = 0; j < map.get(val); j++)
                res.add(val);
        }

        res.addAll(remaining);

        return res.stream().mapToInt(Integer::intValue).toArray();

    }
}