package 剑指offer;

/**
 * Created by Administrator on 2018/10/31.
 */
public class 把字符串转换成整数 {
    public int StrToInt(String str) {
        int res=0,i=0;
        boolean nag=false;
        while (i<str.length()&&str.charAt(i)==' ')
            i++;
        if(i==str.length())
            return 0;
        else if (str.charAt(i)=='+'){
            i++;
        }else if (str.charAt(i)=='-'){
            i++;
            nag=true;
        }
        for(;i<str.length();i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9')
                return 0;
            res=res*10+(str.charAt(i)-'0');
        }
        return nag?-res:res;
    }
}
