package Q0997;

public class Solution {

    public int findJudge(int N, int[][] trust) {
        int[] f=new int[N+1];
        int[] t=new int[N+1];
        for(int i=0;i<trust.length;i++){
            f[trust[i][1]]++;
            t[trust[i][0]]++;
        }
        int ans=-1;
        for(int i=1;i<=N;i++){
            if(f[i]==N-1&&t[i]==0){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] t={{1,2}};
        int a=s.findJudge(2,t);
        System.out.println(a);
    }
}