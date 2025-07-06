class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums)-1
        mid = (low+high)//2
        if target in nums:
            return nums.index(target)
        if target < nums[low]:
            return low
        elif target > nums[high]:
            return high + 1
        while low <= high:

            if target < nums[mid]:
                high = mid - 1
                mid = (low+high)//2
            elif target > nums[mid]:
                low = mid + 1
                mid = (low+high)//2
        return mid+1

            