import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(nums.length); // value → index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer j = seen.get(complement);
            if (j != null) {          // match found
                return new int[] { j, i };
            }
            seen.put(nums[i], i);     // store after the check
        }
        return new int[0];            // never reached per problem guarantee
    }
}
