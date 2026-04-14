class Solution {
    
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int k = 0;
        int currentValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            }
            if (currentValue != nums[i] || i == nums.length - 1) {
                while(count > 1) {
                    nums[i-count] = Integer.MAX_VALUE;
                    count--;
                    k++;
                }
                count = 0;
                currentValue = nums[i];
            }
            
        }
        Arrays.sort(nums);
        return nums.length - k;
    }
    
}