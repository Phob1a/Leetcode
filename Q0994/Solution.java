package Q0994;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    public  int orangesRotting(int[][] grid) {
         int dx[]={1,-1,0,0};
         int dy[]={0,0,1,-1};
        int n=grid.length;
        int m=grid[0].length;
        int t=0;
        Queue<int[]>q=new LinkedList<>();

        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    res++;
                }
                else if(grid[i][j]==2){
                     ((LinkedList<int[]>) q).push(new int[]{i,j,0});
                }
            }
        }
        //int x=q.size();
        //if(x!=0) t++;
        while(!q.isEmpty()){
            int f[]= ((LinkedList<int[]>) q).poll();
            //((LinkedList<int[]>) q).pop();
            t=f[2];
            for(int i=0;i<4;i++){
                int nx=f[0]+dx[i];
                int ny=f[1]+dy[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<m){
                    if(grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        ((LinkedList<int[]>) q).offer(new int[]{nx,ny,f[2]+1});
                        res--;
                    }
                }
            }
        }


    return res==0?t:-1;
    }

//    public static void main(String[] args) {
//        int[][] g={
//                {2,1,1},{1,1,0},{0,1,1}
//        };
//        int a=orangesRotting(g);
//        System.out.println(a);
//    }
}
