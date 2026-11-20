class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int num: nums) {
            int abs = Math.abs(num);
            nums[abs-1] = -Math.abs(nums[abs-1]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) res.add(i+1);
        }
        return res;
    }
}