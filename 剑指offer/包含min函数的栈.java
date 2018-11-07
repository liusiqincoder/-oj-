package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2018/10/7.
 */
public class 包含min函数的栈 {

    Stack<Integer> st=new Stack<>();
    LinkedList<Integer> minQue=new LinkedList<>();
    public void push(int node) {
        int index=0;
        st.add(node);
        for(;index<minQue.size();index++){
            if(minQue.get(index)>node){
                break;
            }
        }
        minQue.add(index,node);
    }

    public void pop() {
        int num=st.pop();
        for(int i=0;i<minQue.size();i++){
            if(minQue.get(i)==num){
                minQue.remove(i);
                break;
            }
        }
    }

    public int top() {
        return st.peek();
    }

    public int min() {
        return minQue.isEmpty()?0:minQue.get(0);
    }
}
