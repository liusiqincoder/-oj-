package 剑指offer;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/10/12.
 */
public class 数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.getOrDefault(array[i],0)+1>array.length/2){
                return array[i];
            }else{
                map.put(array[i],map.getOrDefault(array[i],0)+1);
            }
        }
        return 0;
    }
}
