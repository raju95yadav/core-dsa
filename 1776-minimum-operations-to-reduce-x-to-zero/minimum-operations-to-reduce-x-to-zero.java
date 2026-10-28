
import java.util.*;

class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;

        mp.put(0, -1);

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            mp.putIfAbsent(sum, i);
        }

        int remainingSum = sum - x;
        int longestSubArray = -1;

        sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int findSum = sum - remainingSum;

            if (mp.containsKey(findSum)) {
                int idx = mp.get(findSum);

                if (idx < i) {
                    longestSubArray = Math.max(
                        longestSubArray, i - idx
                    );
                }
            }
        }

        if (remainingSum == 0) {
            longestSubArray = Math.max(longestSubArray, 0);
        }

        return longestSubArray == -1 ? -1 : n - longestSubArray;
    }
}
