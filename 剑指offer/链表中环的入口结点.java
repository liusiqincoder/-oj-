package 剑指offer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Administrator on 2018/11/5.
 */
public class 链表中环的入口结点 {
    /*public ListNode EntryNodeOfLoop(ListNode pHead){
        HashSet<ListNode> set=new HashSet<>();
        ListNode p=pHead;
        while (p!=null){
            if(!set.contains(p)){
                set.add(p);
            }else {
                return p;
            }
            p=p.next;
        }
        return null;
    }*/

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)return null;
        ListNode p1=pHead;
        ListNode p2=pHead;
        while(p2!=null&&p2.next!=null)
        {
            p1=p1.next;
            p2=p2.next.next;
            if(p1==p2)
            {
                p1=pHead;
                while(p1!=p2)
                {
                    p1=p1.next;
                    p2=p2.next;
                }
                if(p1==p2)return p1;
            }
        }
        return null;
    }

}
