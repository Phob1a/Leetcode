package Q0945;

import java.util.*;

public class Solution {

    public int minIncrementForUnique(int[] A) {
        int[] cnt=new int[800001];
        for(int a:A){
            cnt[a]++;
        }
        int ans=0;
        for(int i=1;i<=40000;i++){
            while(cnt[i]>1){
                cnt[i]--;
                int k=i;
                while(true){
                    k++;
                    ans++;
                    if(cnt[k]==0){
                        cnt[k]=1;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
