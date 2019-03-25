package Q0830;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> l=new ArrayList<>();
        int cnt=0;

        for(int i=1;i<S.length();i++){
            cnt++;
            if(i==S.length()-1){
                //cnt++;
                if(cnt>=3){
                    List tmp=new ArrayList<Integer>();
                    tmp.add(i-cnt+1);
                    tmp.add(i);
                    l.add(tmp);
                }
            }
            else if(S.charAt(i)==S.charAt(i+1)){
                //cnt++;
                continue;
            }
            else{
                if(cnt>=3){
                    List tmp=new ArrayList<Integer>();
                    tmp.add(i-cnt+1);
                    tmp.add(cnt);
                    l.add(tmp);
                }
                cnt=0;
            }
        }
        return l;
    }
}
