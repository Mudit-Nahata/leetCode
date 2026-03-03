class Solution {
    public void moveZeroes(int[] nums) {
        int insertNums = 0;
        for (int num : nums) {
            if (num != 0) nums[insertNums++] = num;
        }
        while(insertNums < nums.length) nums[insertNums++] = 0;
    }
}