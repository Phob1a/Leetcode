package Q0985;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
       int[] ans=new int[queries.length];
       int i=0;
       int sum=0;
       for(int a:A){
           if(a%2==0) sum+=a;
       }
       for(int[] q:queries){
           if(A[q[1]]%2==0){
               sum-=A[q[1]];
           }
           A[q[1]]+=q[0];
           if(A[q[1]]%2==0){
               sum+=A[q[1]];
           }
           ans[i++]=sum;
       }
       return ans;
    }
}
