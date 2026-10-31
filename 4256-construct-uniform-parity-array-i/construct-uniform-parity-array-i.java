class Solution {
    public boolean uniformArray(int[] nums) {
        int even = 0;
        int odd = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return even == 0 || odd == 0 || even > 0 && odd > 0;
    }
}