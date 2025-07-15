class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        major = counter = 0
        for i in nums:
            if counter == 0:
                major = i
                counter += 1
            elif major == i:
                counter += 1
            else:
                counter -= 1

        return major