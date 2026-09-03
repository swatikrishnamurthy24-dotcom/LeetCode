class Solution {

    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }

    private int solve(int[] nums, int target, int index, int sum) {

        if (index == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        int add = solve(nums, target, index + 1, sum + nums[index]);

        int subtract = solve(nums, target, index + 1, sum - nums[index]);

        return add + subtract;
    }
}
