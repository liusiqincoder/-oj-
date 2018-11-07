package 剑指offer;

/**
 * Created by Administrator on 2018/10/6.
 */
public class 反转链表 {
    public ListNode ReverseList(ListNode head) {
        ListNode h=new ListNode(0),p;
        while(head!=null){
            p=head;
            head=head.next;
            p.next=h.next;
            h.next=p;
        }
        return h.next;
    }
}
