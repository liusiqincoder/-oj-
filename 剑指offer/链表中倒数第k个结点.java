package 剑指offer;

/**
 * Created by Administrator on 2018/10/6.
 */
public class 链表中倒数第k个结点 {
    public ListNode FindKthToTail(ListNode head,int k) {
        int num=0;
        ListNode node=head;
        while (node!=null){
            num++;
            node=node.next;
        }
        if(num<k)
            return null;
        num=num-k;
        node=head;
        while(num>0){
            node=node.next;
            num--;
        }
        return node;
    }
}
