package 剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

/**
 * Created by Administrator on 2018/10/10.
 */
public class 二叉树中和为某一值的路径 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(target==0||root==null){
            return res;
        }
        Stack<Integer> nums=new Stack<>();
        dfs(res,nums,root,target);
        res.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.size()-o1.size();
            }
        });
        return res;
    }

    private void dfs(ArrayList<ArrayList<Integer>>res, Stack<Integer> nums, TreeNode root, int target){
        if(target==root.val&&root.left==null&&root.right==null){
            nums.add(root.val);
            ArrayList<Integer> arr=new ArrayList<>(nums);
            nums.pop();
            res.add(arr);
            return;
        }
        nums.add(root.val);
        target-=root.val;
        if(root.left!=null)
            dfs(res,nums,root.left,target);
        if(root.right!=null)
            dfs(res,nums,root.right,target);
        nums.pop();
        target+=root.val;
    }

}
