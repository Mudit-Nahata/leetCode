class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = []
        for i in nums:
            if i in result:
                result.remove(i)
            else:
                result.append(i)
        return result[0]