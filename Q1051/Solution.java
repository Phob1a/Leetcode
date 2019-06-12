package Q1051;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {

        int [] s= Arrays.copyOf(heights,heights.length);
        Arrays.sort(s);
        int dif=0;
        for(int i=0;i<s.length;i++){
            if(s[i]!=heights[i]){
                dif++;
            }
        }
        return dif;
    }
}