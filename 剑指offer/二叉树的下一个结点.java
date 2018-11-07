package 剑指offer;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Administrator on 2018/11/5.
 */
public class 二叉树的下一个结点 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)return null;
        if(pNode.right!=null)
        {
            pNode=pNode.right;
            while(pNode.left!=null)
            {
                pNode=pNode.left;

            }return pNode;
        }
        while(pNode.next!=null)
        {
            if(pNode.next.left==pNode)return pNode.next;
            pNode=pNode.next;
        }
        return null;
    }
}