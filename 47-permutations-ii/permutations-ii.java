class Solution {
    void swap(int n, int m,int[] nums){
        int temp = nums[n];
        nums[n] = nums[m] ;
        nums[m] = temp;
    }
    void function(int idx, int[] nums, List<List<Integer>> ans){
        if(idx ==nums.length){
            List<Integer> ds = new ArrayList<>();
            for (int num : nums) {
                ds.add(num);
            }
            ans.add(ds);
            return ;
        }
        Set<Integer> seen = new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if (seen.add(nums[i])) {
                swap(i, idx, nums);
                function(idx + 1, nums, ans);
                swap(i, idx, nums);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n= nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        function(0, nums,ans);
        return ans;
    }
}