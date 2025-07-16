class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        numsDict = {}
        for index, val in enumerate(nums):
            if val in numsDict and index - numsDict[val] <= k:
                return True
            numsDict[val] = index
        return False