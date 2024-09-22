class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        // Arrays.stream(values).anyMatch("s"::equals);

        Set<String> set = new HashSet<>();
        for(String str : bannedWords)
            set.add(str);

        int count = 0;
        for(String msg : message){
            if(set.contains(msg))
                count++;
            
            if(count == 2)
                return true;
        }

        return false;

    }
}