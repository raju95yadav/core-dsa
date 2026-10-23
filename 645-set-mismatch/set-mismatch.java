class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int idx = -1;
        int dup = -1;
        for(int i=0;i<n;i++){
            int val = Math.abs(nums[i]);
            if (nums[val - 1] < 0) {
                dup = val;
            } else {
                nums[val - 1] *= -1;
            }
        }
        for(int i =0 ;i<n;i++){
            if(nums[i] >0){
                idx = i+1;
                break;
            }
        }
        return new int[]{dup,idx};
    }
}