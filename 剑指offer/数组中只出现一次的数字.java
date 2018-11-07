package 剑指offer;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/10/28.
 */
public class 数组中只出现一次的数字 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i]))
                set.remove(array[i]);
            else set.add(array[i]);
        }
        boolean a=false;
        for (int num:set){
            if(!a)
                num1[0]=num;
            else
                num2[0]=num;
            a=true;
        }
    }
}
