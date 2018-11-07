package 剑指offer;

/**
 * Created by Administrator on 2018/10/28.
 */
public class 平衡二叉树 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        if(root.left!=null&&(root.left.val>root.val||!IsBalanced_Solution(root.left)))
            return false;
        if(root.right!=null&&(root.right.val<root.val||!IsBalanced_Solution(root.right)))
            return false;
        return true;
    }
}
