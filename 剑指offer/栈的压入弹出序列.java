package 剑指offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by Administrator on 2018/10/7.
 */
public class 栈的压入弹出序列 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> set=new HashMap<>();
        int pos=0;
        for(int i=0;i<popA.length;i++){
            if(!set.containsKey(popA[i])){
                while (pos<pushA.length&&pushA[pos]!=popA[i]){
                    st.add(pushA[pos]);
                    set.put(pushA[pos],set.getOrDefault(pushA[pos],0)+1);
                    pos++;
                }
                if(pos==pushA.length)
                    return false;
                pos++;
            }else {
                int num=st.pop();
                if(num!=popA[i]){
                    return false;
                }
                set.put(num,set.get(num)-1);
            }
        }
        return true;
    }
}
