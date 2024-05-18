class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        List<Integer> curr;


        for(int i = 0; i < numRows; i++){
            curr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i)
                    curr.add(1);
                else
                    curr.add(prev.get(j)+ prev.get(j-1));
            }
            prev = curr;
            ans.add(prev);
        }

        return ans;
    }
}