class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length > 1 && k < nums.length){
            int[] last = new int[k];
            System.arraycopy(nums, nums.length -k, last, 0, k);
            System.arraycopy(nums, 0, nums, k, nums.length - k);
            System.arraycopy(last, 0, nums, 0, k);
        }
        if(k >=nums.length){
            while(k>0){
                int end = nums[nums.length - 1];
                System.arraycopy(nums, 0, nums, 1, nums.length-1);
                nums[0] = end;
            }
        }
    }
}