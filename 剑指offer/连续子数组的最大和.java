package 剑指offer;

import org.junit.Test;

/**
 * Created by Administrator on 2018/10/15.
 */
public class 连续子数组的最大和 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

    @Test
    public void test(){
        int[] array={6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(array));
    }
}
