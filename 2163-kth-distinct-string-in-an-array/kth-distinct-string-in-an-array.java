class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        Map<String, Integer> distinctStrings = new LinkedHashMap<>();

        for(String str : arr){
            distinctStrings.put(str, distinctStrings.getOrDefault(str,0)+1);
        }

        int distinct = 0;
        for(Map.Entry<String, Integer> entry : distinctStrings.entrySet()){
            if(entry.getValue() == 1)
                distinct++;

            if(distinct == k)
                return entry.getKey();
        }
        
        return "";

    }
}