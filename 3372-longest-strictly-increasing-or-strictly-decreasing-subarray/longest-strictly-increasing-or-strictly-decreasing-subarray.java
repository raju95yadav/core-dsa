class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
     int result = 0;
     for(int i=0;i<n;i++){
        int j = i+1;
        int incr = 1;
        while(j<n && nums[j]>nums[j-1]){
            incr ++;
            j ++;
        }
        j = i+1;
        int decr = 1;
        while(j<n && nums[j]<nums[j-1]){
            decr ++;
            j ++;
        }
        int max = Math.max(incr , decr);
        result = Math.max(max, result);
     }
     return result;
    }
}