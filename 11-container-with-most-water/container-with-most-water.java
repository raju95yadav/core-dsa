class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans =0;
        int l=0,r=n-1;
        while(l<r){
          int width = (r-l);
          int hight = Math.min(height[l],height[r]);
          int area = width * hight ;
          ans = Math.max(ans , area);
          if(height[l] < height[r]) l ++;
          else r --;
        }
        return ans;
    }
}