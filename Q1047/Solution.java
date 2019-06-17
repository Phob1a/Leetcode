package Q1047;

import java.util.Stack;

public class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st= new Stack<>();
        String ans="";
        for(int i=0;i<S.length();i++){
            char tmp=S.charAt(i);
            if(!st.empty()&&st.peek()==tmp){
                st.pop();
            }
            else st.push(tmp);
        }
        while(!st.empty()){
            ans+=st.pop();
        }
        ans=new StringBuffer(ans).reverse().toString();
        return ans;
    }
}
