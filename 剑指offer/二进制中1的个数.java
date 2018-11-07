package 剑指offer;

/**
 * Created by Administrator on 2018/10/6.
 */
public class 二进制中1的个数 {
    public int NumberOf1(int n) {
        if(n==Integer.MIN_VALUE)
            return 1;

        int res=0;
        if(n<0){
            n=-n;
            n=~n+1;
        }
        while (n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}
