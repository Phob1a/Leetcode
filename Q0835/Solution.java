package Q0835;

public class Solution {

    public int largestOverlap(int[][] A, int[][] B) {
            int n=A.length;
            int[][] k=new int[3*n][3*n];

            for(int i=n;i<2*n;i++){
                for(int j=n;j<2*n;j++){
                    k[i][j]=A[i-n][j-n];
                }
            }

            int ans=0;
            for(int i=0;i<=2*n;i++){
                for(int j=0;j<=2*n;j++){
                    int tmp=0;
                    for(int d=0;d<n;d++){
                        for(int h=0;h<n;h++){
                            if(k[i+d][j+h]==1&&B[d][h]==1){
                                tmp++;
                            }
                        }
                    }
                    ans=Math.max(ans,tmp);
                }
            }
            return ans;
    }
}
