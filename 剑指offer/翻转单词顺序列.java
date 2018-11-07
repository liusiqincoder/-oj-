package 剑指offer;

/**
 * Created by Administrator on 2018/10/29.
 */
public class 翻转单词顺序列 {
    public String ReverseSentence(String str) {
        if(str == null){ return null;}
        if(str.trim().equals("")){
            return str;
        }
        StringBuffer res=new StringBuffer();
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--) {
            if(i!=0)
               res.append(arr[i] + " ");
            else
                res.append(arr[i]);
        }
        return res.toString();
    }
}
