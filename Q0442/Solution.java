package Q0442;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> s= new TreeSet<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx=nums[i]-1;
            if(idx==i){
                continue;
            }
            while(nums[idx]!=nums[i]){
                int tmp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=tmp;
                idx=nums[i]-1;
            }
            if(idx==i){
                continue;
            }
            if(nums[idx]==nums[i]){
                s.add(nums[i]);
                //nums[i]=0;
            }
        }
        for(int x:s){
            l.add(x);
        }
        return l;
    }

    public static void main(String[] args) {
        Solution a=new Solution();
        int[] d={2,1};
        List<Integer> l=a.findDuplicates(d);
        System.out.println(l);
    }
}
