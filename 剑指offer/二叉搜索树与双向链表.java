package 剑指offer;

/**
 * Created by Administrator on 2018/10/10.
 */
public class 二叉搜索树与双向链表 {
    private TreeNode pre=null,ret=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return pRootOfTree;
        ret=pRootOfTree;
        while (ret.left!=null){
            ret=ret.left;
        }
        inorder(pRootOfTree);
        return ret;
    }
    private void inorder(TreeNode node){
        if(node==null)
            return;
        TreeNode ppre=null,right= node.right;
        inorder(node.left);
        ppre=pre;
        pre=node;
        inorder(right);
        if(ppre==null){
            return;
        }
        if(node.val>ppre.val){
            ppre.right=node;
            node.left=ppre;
        }else{
            ppre.left=node;
            node.right=ppre;
        }
    }
}
