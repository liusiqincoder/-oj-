package 剑指offer;

import org.junit.Test;

/**
 * Created by Administrator on 2018/10/6.
 * 快速指数幂
 */
public class 数值的整数次方 {
    public double Power(double base, int exponent) {
        double res=1;
        boolean negative=false;
        if(exponent<0){
            negative=true;
            exponent=-exponent;
        }
        while (exponent!=0){
            if((exponent&1)==1){
                res*=base;
            }
            base*=base;
            exponent>>=1;
        }
        return negative?1.0/res:res;
    }

    @Test
    public void test(){
        int num=-4;
        System.out.println(num+","+Power(2,num));
    }
}
