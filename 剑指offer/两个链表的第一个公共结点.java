package 剑指offer;

/**
 * Created by Administrator on 2018/10/28.
 */
public class 两个链表的第一个公共结点 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p=pHead1;
        while (p!=null){
            ListNode h=pHead2;
            while (h!=null){
                if(h==p)
                    return p;
                h=h.next;
            }
            p=p.next;
        }
        return null;
    }
}
