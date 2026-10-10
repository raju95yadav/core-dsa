class Solution {
    public boolean isValid(String s) {
        char[] st = new char[s.length()];
        int top = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ){
                top = top +1;
                st[top] = s.charAt(i);
             //   st.push(s.charAt(i));
            }
            else{
               // if(st.size()==0){
                  if(top<0){
                    return false;
                }
                // if((st.top()=='(' && s.charAt(i)==')') ||
                // (st.top()=='{' && s.charAt(i)=='}') ||
                // (st.top()=='[' && s.charAt(i)==']')  ){
                if((st[top]=='(' && s.charAt(i)==')') ||
                 (st[top]=='{' && s.charAt(i)=='}') ||
                 (st[top]=='[' && s.charAt(i)==']')  ){
                    //st.pop();
                    top = top -1;
                }
                else{
                    return false;
                }
            }
        }
        return top == -1;
    }
}