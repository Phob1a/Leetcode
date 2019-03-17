package Q0969;

import java.util.ArrayList;
import java.util.List;

public class Solution {



    public List<Integer> pancakeSort(int[] A) {
        int n=A.length;
        List<Integer> l=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(A[i]==i+1) continue;
            for(int j=0;j<i;j++){
                if(A[j]==i+1){
                    if(j!=0)l.add(j+1);
                    l.add(i+1);
                    for(int k=0;k<=j;k++){
                        if(k>=j-k) break;
                        int tmp=A[k];
                        A[k]=A[j-k];
                        A[j-k]=tmp;
                    }
                    for(int k=0;k<=i;k++){
                        if(k>=i-k) break;
                        int tmp=A[k];
                        A[k]=A[i-k];
                        A[i-k]=tmp;
                    }
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] a=new int[]{3,2,4,1};
        List e=s.pancakeSort(a);
        System.out.println(e);
    }
}
