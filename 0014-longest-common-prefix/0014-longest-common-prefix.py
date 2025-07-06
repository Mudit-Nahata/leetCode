class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        sol=""
        smallestLength = len(min(strs, key=len))
        for i in range(smallestLength):
            if all(s[i] == strs[0][i] for s in strs):
                sol=sol+strs[0][i]
            else:
                break


        return sol
