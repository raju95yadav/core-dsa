class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int resultsum = nums[0] + nums[1] + nums[2] ;
        int mindifftotarget = Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int l =i+1, r = n-1;
            while(l<r){
                int sum= (nums[i]+nums[l]+nums[r]);
                if(sum == target) return target;
                else if(sum < target) l ++;
                else r --;
            int mindifftosum = Math.abs(target - sum);
            if (mindifftosum < mindifftotarget){
                 resultsum = sum ;
                mindifftotarget = mindifftosum;
               }
            }
        }
        return resultsum;
    }
}