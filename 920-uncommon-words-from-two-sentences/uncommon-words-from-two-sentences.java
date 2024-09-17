class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        Map<String, Integer> count = new HashMap<>();

        for(String str : s1.split(" "))
            count.put(str, count.getOrDefault(str, 0)+1);

        
        for(String str : s2.split(" "))
            count.put(str, count.getOrDefault(str, 0)+1);  

        List<String> res = new ArrayList<>();
        for(String word : count.keySet()){
            if(count.get(word) == 1)
                res.add(word);
        }  

        return res.toArray(new String[0]);
    }
}