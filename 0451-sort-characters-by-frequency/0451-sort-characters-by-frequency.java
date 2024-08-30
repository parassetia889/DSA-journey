class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> freqMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

        List<Character> chars = new ArrayList<>(freqMap.keySet());
        chars.sort((a,b) -> freqMap.get(b)-freqMap.get(a));
        
        StringBuilder sb = new StringBuilder();
        for(char ch : chars){
            int count = freqMap.get(ch);
            for(int i = 1; i <= count; i++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}