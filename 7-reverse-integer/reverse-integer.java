class Solution {
    public int reverse(int x) {
        int ans = 0;
        
        while (x != 0) {
            int remainder = x % 10;
            
            // overflow check
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }
            
            ans = ans * 10 + remainder;
            x = x / 10;
        }
        
        return ans;
    }
}