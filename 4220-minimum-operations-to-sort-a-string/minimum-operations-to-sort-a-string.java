class Solution {
    public int minOperations(String s) {
      int n = s.length();
      char mx = s.charAt(0) , mn = s.charAt(0) ;
      boolean sorted = true;
      for(int i =0;i<n;i++){
        char c = s.charAt(i);
        if(c > mx) mx = c;
        if(c < mn) mn = c;
        if(i>0 && s.charAt(i-1) > c) sorted = false;
      }  
      if(sorted) return 0;
      if(n==2) return -1;
      if(s.charAt(0)==mn || s.charAt(n-1)==mx) return 1;
      for(int i=1;i<n-1;i++){
        if(s.charAt(i)==mn || s.charAt(i) == mx) return 2;
      }
      return 3;
    }
}