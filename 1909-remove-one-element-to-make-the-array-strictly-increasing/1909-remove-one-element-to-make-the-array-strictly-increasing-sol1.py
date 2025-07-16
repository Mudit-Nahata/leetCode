class Solution:
    def canBeIncreasing(self, nums: List[int]) -> bool:
        
        def is_sorted(lst):
            return all(a < b for a, b in zip(lst, lst[1:]))

        for idx in range(len(nums)):
            new_lst = nums[:idx] + nums[idx+1:]   
            if is_sorted(new_lst):
                return True
        return False
