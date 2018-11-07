package 剑指offer;

/**
 * Created by Administrator on 2018/10/6.
 */
public class 合并两个排序的链表 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res=new ListNode(0),p,q=res;
        while (list1!=null||list2!=null){
            if(list1!=null&&list2!=null){
                if(list1.val<list2.val){
                    p=list1;
                    list1=list1.next;
                    p.next=q.next;
                    q.next=p;
                    q=q.next;
                }else {
                    p=list2;
                    list2=list2.next;
                    p.next=q.next;
                    q.next=p;
                    q=q.next;
                }
            }else if(list1==null){
                q.next=list2;
                list2=null;
            }else {
                q.next=list1;
                list1=null;
            }
        }
        return res.next;
    }
}
