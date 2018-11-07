package 剑指offer;

import org.junit.Test;

/**
 * Created by Administrator on 2018/10/6.
 */
public class 变态跳台阶 {
    public int JumpFloorII(int target) {
        int step[]=new int[100],res=0;
        step[0]=0;
        for(int i=1;i<=target;i++){
            step[i]=1;
            for(int j=i-1;j>0;j--){
                step[i]+=step[j];
            }
        }
        return step[target];
    }

    @Test
    public void test(){
        System.out.println(JumpFloorII(2));
    }
}
