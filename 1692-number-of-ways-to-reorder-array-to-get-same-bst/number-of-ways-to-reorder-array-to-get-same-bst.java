class Solution {

    static final int MOD = 1_000_000_007;

    int[][] pascalsTriangle;

    public int numOfWays(int[] nums) {
        pascalsTriangle = new int[nums.length + 1][nums.length + 1];

        for (int i = 0; i <= nums.length; i++) {
            for (int j = 1; j < i; j++) {
                pascalsTriangle[i][j] = (pascalsTriangle[i - 1][j] + pascalsTriangle[i - 1][j - 1]) % MOD;
            }
            pascalsTriangle[i][0] = 1;
            pascalsTriangle[i][i] = 1;
        }

        List<Integer> arr = new ArrayList<>();
        for (int n : nums) {
            arr.add(n);
        }
        
        // helper(arr) - 1 could be negative, add MOD to it
        return (helper(arr) - 1 + MOD) % MOD;
    }

    public int helper(List<Integer> nums) {
        if (nums.size() == 0) return 1;
        int root = nums.get(0);
        List<Integer> left = new ArrayList<>(), right = new ArrayList<>();

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > root) right.add(nums.get(i));
            else left.add(nums.get(i));
        }

        int choose = pascalsTriangle[left.size() + right.size()][left.size()];

        long res = (((long)choose * helper(left) % MOD) * helper(right)) % MOD;
        return (int)res;
    }
}