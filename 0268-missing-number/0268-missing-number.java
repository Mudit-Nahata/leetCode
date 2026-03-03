import java.math.BigInteger;
class Solution {
    public int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int org = ( nums.length * ( nums.length + 1 ) ) / 2;

        return org - sum;
    }
    
}