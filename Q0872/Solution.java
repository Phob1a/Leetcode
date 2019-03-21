package Q0872;

import java.util.ArrayList;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public ArrayList<Integer>l1,l2;

    public void findLeaf(TreeNode t,int l){
        if(t==null) return;
        if(t.left==null&&t.right==null){
            if (l == 1) {
                l1.add(t.val);
            } else {
                l2.add(t.val);
            }
        }
        else{
            if(t.left!=null) findLeaf(t.left,l);
            if(t.right!=null) findLeaf(t.right,l);
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      l1=new ArrayList<>();
      l2=new ArrayList<>();
      findLeaf(root1,1);
      findLeaf(root2,2);
      return l1.equals(l2);
    }
}
