package 剑指offer;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.*;
/**
 * Created by Administrator on 2018/10/21.
 */
public class 把数组排成最小的数 {

    public static String PrintMinNumber(int [] numbers) {
        ArrayList<String> str=new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            str.add(String.valueOf(numbers[i]));
            System.out.println(str.get(i));
        }
        str.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int max1=-1,max2=-1;
                for(int i=0;i<o1.length();i++){
                    if(max1<o1.charAt(i)-'0'){
                        max1=o1.charAt(i)-'0';
                    }
                }
                for(int i=0;i<o2.length();i++){
                    if(max2<o2.charAt(i)-'0'){
                        max2=o2.charAt(i)-'0';
                    }
                }
                if(max1>max2){
                    return 1;
                }else if(max1<max2){
                    return -1;
                }else{
                    if(o1.length()==o2.length()){
                        return 0;
                    }else if (o1.length()<o2.length()){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        });
        StringBuffer res=new StringBuffer();
        for(int i=0;i<str.size();i++){
            res.append(str.get(i));
        }
        return res.toString();
    }

    public static void main(String[] args){
        int[] num={3,5,1,4,2};
        System.out.println(PrintMinNumber(num));
    }

}
