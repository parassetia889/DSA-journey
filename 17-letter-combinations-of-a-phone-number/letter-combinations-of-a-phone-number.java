class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();

        if(digits == null || digits.isEmpty())
            return res;


        String[] mappings = {"","" ,"abc","def",
                            "ghi","jkl",
                            "mno", "pqrs",
                            "tuv","wxyz"};

        formCombinations(res, digits, "", 0, mappings);
        return res;
    }

    private void formCombinations(List<String> res, String digits, String curr, int indx, String[] mappings){
        
        if(indx == digits.length()){
            res.add(curr);
            return;
        }

        String strs = mappings[digits.charAt(indx) - '0'];

        for(char ch : strs.toCharArray()){
            // curr -> ad
            formCombinations(res, digits, curr+ch, indx+1, mappings);
        }

    }
}