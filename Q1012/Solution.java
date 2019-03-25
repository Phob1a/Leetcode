package Q1012;

public class Solution {

    public int bitwiseComplement(int N) {
           int k=1;
           while(N>=k){
               k*=2;
           }
           return k-N-1;
    }
}
