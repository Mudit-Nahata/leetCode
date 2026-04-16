class Solution {
    public boolean canJump(int[] nums) {
        
        if (nums.length <= 1) return true;
        int fetch = 0;
        for (int i = 0; i <= fetch; i++) {
            int j = i + nums[i];
            if (j > fetch) {
                fetch = j;
            }
            if (fetch >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}