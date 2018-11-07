package 剑指offer;

import org.junit.Test;

/**
 * Created by Administrator on 2018/10/6.
 */
public class 矩形覆盖 {
    public int RectCover(int target) {
        int[] block=new int[target+2];
        block[0]=0;
        block[1]=1;
        for(int i=2;i<=target;i++){
            block[i]=block[i-2]+block[i-1];
        }
        return block[target];
    }

    @Test
    public void test(){
        System.out.println(RectCover(5));
    }
}
