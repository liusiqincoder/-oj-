package 剑指offer;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/10/24.
 */
public class 丑数 {
    public static int GetUglyNumber_Solution(int index) {
        Queue<Integer> que1=new LinkedList<>(),
                que2=new LinkedList<>(),
                que3=new LinkedList<>();
        int min=1,num=1;
//        que1.add(1);
        while(num<index){
            if((min*2)%7!=0)
               que1.add(min*2);
            if((min*3)%7!=0&&(min*3)%2!=0)
                que2.add(min*3);
            if((min*5)%7!=0&&(min*5)%2!=0&&(min*5)%3!=0)
                que3.add(min*5);
            int num1=que1.isEmpty()?Integer.MAX_VALUE:que1.peek(),
                    num2=que2.isEmpty()?Integer.MAX_VALUE:que2.peek(),
                    num3=que3.isEmpty()?Integer.MAX_VALUE:que3.peek();
            if(num1<=num2&&num1<=num3){
                min=num1;
                que1.poll();
            }else if(num2<=num1&&num2<=num3){
                min=num2;
                que2.poll();
            }else {
                min=num3;
                que3.poll();
            }
            num++;
        }
        return min;
    }

    @Test
    public void test(){
        System.out.println(GetUglyNumber_Solution(9));
    }
}
