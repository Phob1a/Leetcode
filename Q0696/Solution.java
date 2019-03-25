package Q0696;

public class Solution {


        public int countBinarySubstrings(String s) {
            int ans=0;
            int cnt=0;
            int pc=0;
            for(int i=0;i<s.length();i++){
                cnt++;
                if(i==s.length()-1){
                    ans+=Math.min(cnt,pc);
                    continue;
                }
                if(s.charAt(i)==s.charAt(i+1)){
                    continue;
                }
                else{
                    ans+=Math.min(cnt,pc);
                    pc=cnt;
                    cnt=0;
                }
            }
            return ans;
        }
}
