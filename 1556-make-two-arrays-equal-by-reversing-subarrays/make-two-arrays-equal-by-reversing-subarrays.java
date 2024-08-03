class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : target)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(int num : arr){
            if( !map.containsKey(num))
                return false;
        

        map.put(num, map.get(num)-1);
        if(map.get(num) == 0)
            map.remove(num);

        }
        return true;
    }
}