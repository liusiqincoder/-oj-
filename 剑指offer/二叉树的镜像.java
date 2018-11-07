package 剑指offer;

/**
 * Created by Administrator on 2018/10/7.
 */
public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
        if(root==null)
            return;
        Mirror(root.left);
        Mirror(root.right);
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
    }
}
