package Q0999;

public class Solution {

    public int[] dx={1,-1,0,0};
    public int[] dy={0,0,1,-1};


    public int numRookCaptures(char[][] board) {

           int ans=0;
           int n,m;
           n=board.length;
           m=board[0].length;
           for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   if(board[i][j]=='R'){
                       for(int k=0;k<4;k++){
                           int x=i,y=j;
                           x+=dx[k];
                           y+=dy[k];
                           while(x>=0&&x<n&&y>=0&&y<m){
                               if(board[x][y]=='p'){
                                   ans++;
                                   break;
                               }
                               if(board[x][y]=='B'){
                                   break;
                               }
                               x+=dx[k];
                               y+=dy[k];
                           }
                       }
                   }
               }
           }
           return ans;
    }
}

