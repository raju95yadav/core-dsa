class Solution {
    public int strStr(String haystack, String needle) {
        int n= haystack.length();
        int m= needle.length();
        int starth=0, startn=0 ;
        while(starth < n && startn < m){
            char c1 = haystack.charAt(starth);
            char c2 = needle.charAt(startn);

            if(c1 == c2) {
                  starth ++;
                startn ++;
            }
            else{
              starth = starth - startn + 1;
                startn = 0;
            }
        }
        return (startn == m) ? starth - startn : -1;
    }
}