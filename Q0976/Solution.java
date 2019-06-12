package Q0976;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int ans=0;
        for(int i=A.length-1;i>1;i--){
            if(A[i]<A[i-1]+A[i-2]){
                ans=A[i]+A[i-1]+A[i-2];
                break;
            }
        }
        return ans;
    }
}
