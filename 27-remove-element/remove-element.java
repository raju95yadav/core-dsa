class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length;
        int count =0;
        int ansind=0;
        int start =0;
        while(start<n){
            if(nums[start] == val) start ++;
            else{
                count ++;
                nums[ansind] = nums[start];
                ansind ++;
                start ++;
            }
            
        }
        return count;
    }
}