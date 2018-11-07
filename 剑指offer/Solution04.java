package 剑指offer;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Administrator on 2018/10/4.
 */
public class Solution04 {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        return constructTree(pre, 0, pre.length, in, 0, in.length);
    }

    private static TreeNode constructTree(int[] pre, int preStart, int preEnd, int[] in, int start, int end) {
        if (preStart >= preEnd || start >= end) {
            return null;
        }
        if (start + 1 == end) {
            return new TreeNode(in[start]);
        }
        int pos = start;
        for (; pos < end; pos++) {
            if (pre[preStart] == in[pos]) {
                break;
            }
        }
        int len = pos - start;

        TreeNode node = new TreeNode(in[pos]);
        node.left = constructTree(pre, preStart + 1, preStart + len + 2, in, start, pos);
        node.right = constructTree(pre, preStart + len + 2, preEnd, in, pos + 1, end);
        return node;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 3, 5, 6}, in = {4, 2, 1, 5, 3, 6};
        System.out.println(reConstructBinaryTree(pre, in));
    }
}
