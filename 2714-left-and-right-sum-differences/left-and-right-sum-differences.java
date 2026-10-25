class Solution {
    public int[] leftRightDifference(int[] nums) {
       int n = nums.length;
       int sum =0, curr =0;
       for(int i=0;i<n;i++){
        sum += nums[i];
       } 
       int[] result = new int[n];
       for(int i=0;i<n;i++){
        int leftsum = curr;
        curr += nums[i];
        int rightsum = sum - curr ;
        result[i] = Math.abs(rightsum - leftsum);
       }
       return result;
    }
}