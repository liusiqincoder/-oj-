package 剑指offer;

/**
 * Created by Administrator on 2018/10/6.
 */
public class Solution07 {
    public int Fibonacci(int n) {
        int[] f=new int[40];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++)
            f[i]=f[i-1]+f[i-2];
        return f[n];
    }
}
