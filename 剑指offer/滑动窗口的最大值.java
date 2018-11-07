package 剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Administrator on 2018/11/7.
 */
public class 滑动窗口的最大值 {
    private static PriorityQueue<Integer> minHeap=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        int start=0;
        ArrayList<Integer> res=new ArrayList<>();
        if (num==null||num.length<size){
            return res;
        }
        if (num==null||num.length<size||size==0){
            return res;
        }

        for (int i=0;i<size;i++){
            minHeap.add(num[i]);
        }

        res.add(minHeap.peek());
        for (int i=size;i<num.length;i++){
            if (minHeap.peek().equals(num[start++]))
                minHeap.poll();
            minHeap.add(num[i]);
            res.add(minHeap.peek());
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums={2,3,4,2,6,2,5,1};
        int k=3;
        ArrayList<Integer> res=maxInWindows(nums,k);
        for (int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
