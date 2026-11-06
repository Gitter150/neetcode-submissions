class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i <= nums.length - k; i++) {
            if (nums[i+k-1] - nums[i] < diff) {
                diff = nums[i+k-1] - nums[i];
            }
        }
        return diff;
    }
    // 1 2 3 3 5 6 7
}