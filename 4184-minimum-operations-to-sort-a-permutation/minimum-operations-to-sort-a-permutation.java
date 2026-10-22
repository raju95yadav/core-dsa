class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ascending = 0;
        int decending = 0;
        for (int i = 1; i < n; i++) {
            ascending += (nums[i] == (nums[i - 1] + 1) % n) ? 1 : 0;
            decending += (nums[i - 1] == (nums[i] + 1) % n) ? 1 : 0;
        }
        if (ascending == n - 1 && nums[0] == 0) return 0;
        if (ascending == n - 1) {
            int leftrot = n - nums[0];
            int rightrot = 1 + (nums[n - 1] + 1) + 1;
            return Math.min(leftrot, rightrot);
        }
        if (decending == n - 1) {
            int leftrot = n - nums[n-1] + 1;
            int rightrot = (nums[0]+1)%n + 1;
            return Math.min(leftrot, rightrot);
        }
        return -1;
    }
}
