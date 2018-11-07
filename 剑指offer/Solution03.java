package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2018/10/4.
 */
public class Solution03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        ListNode node = listNode;
        while (node != null) {
            st.add(node.val);
            node = node.next;
        }
        while (!st.isEmpty()) {
            res.add(st.pop());
        }
        return res;
    }
}
