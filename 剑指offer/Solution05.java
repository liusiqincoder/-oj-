package 剑指offer;

/**
 * Created by Administrator on 2018/10/4.
 */

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        while (!stack1.isEmpty())
            stack2.add(stack1.pop());
        int num = 0;
        if (!stack2.isEmpty())
            num = stack2.pop();
        while (!stack2.isEmpty())
            stack1.add(stack2.pop());
        return num;
    }
}
