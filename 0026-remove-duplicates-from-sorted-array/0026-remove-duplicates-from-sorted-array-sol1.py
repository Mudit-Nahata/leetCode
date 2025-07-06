class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        expectedNums = []
        k = 0
        i = len(nums)-1
        while i >= 0:
            if nums[i] in expectedNums:
                del nums[i]
                i-=1
                continue
            else:

                expectedNums.append(nums[i])
                k+=1
                i-=1

                
        expectedNums.reverse()
        nums[:] = expectedNums
        return k
       
        