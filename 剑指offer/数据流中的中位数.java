package 剑指offer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/11/7.
 */
public class 数据流中的中位数 {
   private PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>(new Comparator<Integer>() {
       @Override
       public int compare(Integer o1, Integer o2) {
           return o1-o2;
       }
   }),
    maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return 02-o1;
        }
    });

    public void Insert(Integer num) {
        if (this.maxHeap.isEmpty() || num <= this.maxHeap.peek()) {
            this.maxHeap.add(num);
        } else {
            this.minHeap.add(num);
        }
        while (Math.abs(this.maxHeap.size() - this.minHeap.size()) > 1) {
            if (this.maxHeap.size() > this.minHeap.size()) {
                this.minHeap.add(this.maxHeap.poll());
            } else {
                this.maxHeap.add(this.minHeap.poll());
            }
        }
    }

    public Double GetMedian() {
        int maxsize = this.maxHeap.size();
        int minsize = this.minHeap.size();
        if ((minsize + maxsize) % 2 == 0) {
            return Double.valueOf((this.maxHeap.peek() + this.minHeap.peek()) / 2.0);
        } else {
            if (maxsize > minsize) {
                return Double.valueOf(this.maxHeap.peek());
            } else {
                return Double.valueOf(this.minHeap.peek());
            }
        }
    }
}
