class Solution {
    public int removeDuplicates(int[] nums) {
        int nowNum = 10000000;
        int numCount = 0;
        int idx = 0;
        
        for(int num : nums) {
            if (num != nowNum) {
                nums[idx++] = num;
                nowNum = num;
                numCount = 1;
            } else {
                if (numCount <= 1) {
                    nums[idx++] = num;
                    numCount++;
                }
            }
        }

        return idx;
    }
}