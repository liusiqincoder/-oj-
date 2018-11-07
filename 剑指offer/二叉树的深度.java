package 剑指offer;

/**
 * Created by Administrator on 2018/10/28.
 */
public class 二叉树的深度 {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}
