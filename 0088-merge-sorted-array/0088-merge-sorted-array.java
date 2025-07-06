class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Arrays.sort(nums1);
        int[] nums3 = Arrays.copyOfRange(nums1, 0, nums1.length-n);
        int[] num4  = IntStream.concat(Arrays.stream(nums3), 
        Arrays.stream(nums2)).toArray();
        System.arraycopy(num4, 0, nums1, 0, m+n);
        Arrays.sort(nums1);
    }
}