package 剑指offer;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/10/10.
 */
public class 复杂链表的复制 {
    HashMap<RandomListNode,RandomListNode> maps=new HashMap<>();
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null)
            return null;
        RandomListNode node=new RandomListNode(pHead.label);
        maps.put(pHead,node);
        if(pHead.next!=null&&maps.containsKey(pHead.next)){
            node.next=maps.get(pHead.next);
        }else{
            node.next=Clone(pHead.next);
        }

        if(pHead.random!=null&&maps.containsKey(pHead.random)){
            node.random=maps.get(pHead.random);
        }else{
            node.random=Clone(pHead.random);
        }
        return node;
    }

}
