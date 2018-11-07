package 剑指offer;

/**
 * Created by Administrator on 2018/11/5.
 */
public class 对称的二叉树 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot==null){
            return true;
        }
        return help(pRoot.left,pRoot.right);
    }

    boolean help(TreeNode l,TreeNode r){
        if (l==null||r==null){
            return r==l;
        }
        return l.val==r.val&&help(l.left,r.right)&&help(r.left,l.right);
    }
}
