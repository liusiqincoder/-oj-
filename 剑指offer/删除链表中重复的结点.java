package 剑指offer;

/**
 * Created by Administrator on 2018/11/5.
 */
public class 删除链表中重复的结点 {

    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null||pHead.next==null)
            return pHead;
        ListNode h=new ListNode(pHead.val-1);
        h.next=pHead;
        ListNode p=h;
        while (p!=null) {
            if (p.next!=null&&p.next.next!=null&&p.next.val==p.next.next.val){
                ListNode q=p.next;
                int num=q.val;
                while (q.next!=null&&q.next.val==num){
                    q=q.next;
                }
                p.next=q.next;
                q.next=null;
            }else {
                p = p.next;
            }
        }
        return h.next;
    }

}
