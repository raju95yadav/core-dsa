class Solution {
    public int scoreOfParentheses(String s) {
        int count =0, maxcount=0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                count++;
            }
               else if(ch==')'){
                    count--;
                    if(s.charAt(i-1)=='('){
                        maxcount += (1<<count);
                    }
                }
            }
        return maxcount;
    }
}