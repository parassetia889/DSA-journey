class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
    Map<Integer, Integer> countMap = new HashMap<>();

    for(int i : arr2)
        countMap.put(i, 0);

    List<Integer> res = new ArrayList<>();
    List<Integer> remaining = new ArrayList<>();

    for(int val : arr1){
        if(countMap.containsKey(val))
            countMap.put(val, countMap.get(val)+1);
        else
            remaining.add(val);
    }

    Collections.sort(remaining);

    for(int val : arr2){
        for(int j = 0; j < countMap.get(val); j++)
            res.add(val);
     }


     res.addAll(remaining);

     return res.stream().mapToInt(Integer::intValue).toArray();
    }
}