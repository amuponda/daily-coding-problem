class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int minPos = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            } else if (nums[i] > minPos) {
                break;
            } else if (nums[i] == minPos) {
                minPos++;
            }
        }
        return minPos;
    }
}
new Solution.findMissingPositive([1, 2, 3, 6, 2, 7, 0] as int [])