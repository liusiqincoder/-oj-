package 剑指offer;

/**
 * Created by Administrator on 2018/10/31.
 */
public class 不用加减乘除做加法 {
    /*
    * 用&和^的特点就能完成加法，实在是强
    * &获得进位，^消除进位后原先的1位
    * */
    public int Add(int num1, int num2)
    {
        int n1,n2;
        n1=(num1&num2)<<1;
        n2=num1^num2;
        while((n1&n2)!=0)
        {
            num1=n1;num2=n2;
            n1=(num1&num2)<<1;
            n2=num1^num2;
        }
        return n1|n2;

    }
}
