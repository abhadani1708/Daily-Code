class Solution {
    public int minAddToMakeValid(String s) {
        int mini=Integer.MAX_VALUE;
        int cnt=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                cnt++;
            }
            else if(ch==')' && !st.isEmpty()){
                st.pop();
                cnt--;
            }
            else {
                cnt++;
            }
        }
        return cnt;
    }
}