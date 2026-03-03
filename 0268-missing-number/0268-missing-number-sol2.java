class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = (n*(n+1))/2;
    int i=0;
    int asum = 0;
    while(i<nums.length){
        asum += nums[i];

       i++;
    }
         return sum - asum;
    }
}