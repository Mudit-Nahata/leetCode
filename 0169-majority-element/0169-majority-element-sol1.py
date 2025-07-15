class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        result = {i : 0 for i in nums}
        for i in nums:
            result[i] = result[i] + 1
        return next((k for k, v in result.items() if v == max(result.values())), None)
        