## 题目

![image]()

`思路`  （别人的思路）利用快慢指针，找到中间节点；将慢指针节点的值压入栈，到达中间节点后，依次出栈与后续节点的值比较。特别注意长度奇偶数

代码实现

```java
import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        boolean use=false;
        ListNode quick=phead,slow=pHead;
        Stack<Integer> st=new Stack<>();
        while(quick!=null){
            st.add(slow.val);
            slow=slow.next;
            quick=quick.next;
            if(quick!=null){
                quick=quick.next;
            }
        }
        while(!st.isEmpty()){
            int num=st.poll();
            if(slow==null||num!=slow.val){
                if(slow!=null&&!use){
                    use=true;
                }else{
                    return false;
                }
            }
            slow=slow.next;
        }
        return true;
    }
}
```
