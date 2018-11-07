package 剑指offer;

/**
 * Created by Administrator on 2018/10/6.
 */
public class 树的子结构 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null)
            return false;
        boolean ok=false;
        if(root1.val==root2.val)
            ok=isSameTree(root1,root2);
        return ok||isSameTree(root1.left,root2)||isSameTree(root1.right,root2);
    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if(root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1.val!=root2.val)
            return false;
        return isSameTree(root1.left,root2.left)&&isSameTree(root1.right,root2.right);
    }

}
