class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = (n*(n+1))/2;
    int i=0;
    int arrsum = 0;
    while(i<nums.length){
        arrsum += nums[i];

       i++;
    }
         return sum - arrsum;
    }
}