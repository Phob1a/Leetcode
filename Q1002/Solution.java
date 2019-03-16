package Q1002;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<String> commonChars(String[] A) {
        List<String> ans= new ArrayList<>();
        int[] f=new int[26];
        for(int k:f){
            k=999999;
        }
        for(String a:A){
            int[] l=new int[26];
            for(int i=0;i<a.length();i++){
                char tmp=a.charAt(i);
                l[tmp-'a']++;
            }
            for(int i=0;i<26;i++){
                f[i]=Math.min(f[i],l[i]);
            }
        }
        for(int i=0;i<26;i++){
            while(f[i]>0){
                f[i]--;
                String t=new String();
                t+=(char)(i+'a');
                ans.add(t);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution a=new Solution();
        String[] k={"cella","cellbel","celler"};
        List<String> f=a.commonChars(k);
        System.out.println(f);
    }
}
