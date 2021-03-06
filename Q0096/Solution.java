package Q0096;

class Solution {


    public int numTrees(int n) {
        int[] dp=new int[n+2];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]=dp[i]+dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }


    public static void main(String[] args) {
        Solution a=new Solution();
        int x=a.numTrees(8);
        System.out.println(x);
    }
}


