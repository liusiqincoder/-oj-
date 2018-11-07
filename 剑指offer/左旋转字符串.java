package 剑指offer;

/**
 * Created by Administrator on 2018/10/29.
 */
public class 左旋转字符串 {
    public static String LeftRotateString(String str,int n) {
        if(n>=str.length())
            return str;
        return str.substring(n)+str.substring(0,n);
    }

    public static void main(String[] args){
        System.out.println(LeftRotateString("aaabbbccc",3));
    }
}
