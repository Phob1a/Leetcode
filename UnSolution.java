import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class UnSolution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode into(TreeNode t,int a){
        if(t==null){
            t=new TreeNode(a);
            return t;
        }
        if(a!=0&&t.val%a==0){
            t.left=into(t.left,a);
        }
        else t.right=into(t.right,a);
        return t;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        nums = IntStream.of(nums)  // 变为 IntStream
                .boxed()           // 变为 Stream<Integer>
                .sorted(Comparator.reverseOrder()) // 按自然序的相反序排序
                .mapToInt(Integer::intValue)       // 变为 IntStream
                .toArray();
        TreeNode root=new TreeNode(nums[0]);
        for(int i=1;i<nums.length;i++){
            root=into(root,nums[i]);
        }
        return root;
    }

    public static void main(String[] args) {
        UnSolution s=new UnSolution();
        int[] nums={6,3,5,1,0,2};
        TreeNode x=s.constructMaximumBinaryTree(nums);
    }
}
