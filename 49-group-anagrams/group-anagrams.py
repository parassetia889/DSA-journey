class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        anagram_dict = {}

        for ele in strs:
            y = "".join(sorted(ele))
            if y in anagram_dict:
                anagram_dict[y].append(ele)

            else:
                anagram_dict[y]=[ele]
        answer = []
        for ele,value in anagram_dict.items():
            answer.append(value)

        return answer
       
        