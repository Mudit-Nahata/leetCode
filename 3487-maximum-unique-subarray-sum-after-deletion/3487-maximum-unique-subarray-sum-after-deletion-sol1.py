class Solution:
    def maxSum(self, nums: List[int]) -> int:
        numsNew = [num for num in nums if num > 0]
        if len(numsNew) == 0:
            return max(nums)
        numSet = set(numsNew)

        return sum(numSet)