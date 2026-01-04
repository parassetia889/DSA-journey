class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> mapping = new HashMap<>();

        for(String str : strs){

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            mapping.putIfAbsent(sortedStr, new ArrayList<>());
            mapping.get(sortedStr).add(str);
        }

        List<List<String>> res = new ArrayList<>();
        res.addAll(mapping.values());
        return res;
    }
}