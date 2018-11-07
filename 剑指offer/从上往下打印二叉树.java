package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/10/7.
 */
public class 从上往下打印二叉树 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        if (root==null)
            return res;
        que.add(root);
        while (!que.isEmpty()){
            int num=que.size();
            for(int i=0;i<num;i++){
                TreeNode t=que.poll();
                res.add(t.val);
                if(t.left!=null)
                    que.add(t.left);
                if(t.right!=null)
                    que.add(t.right);
            }
        }
        return res;
    }
}
