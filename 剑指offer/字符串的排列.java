package 剑指offer;

import org.junit.Test;

import java.util.*;

/**
 * Created by Administrator on 2018/10/12.
 */
public class 字符串的排列 {
    public static ArrayList<String> Permutation(String str) {
        if(str==null||str.length()==0)
            return new ArrayList<>();
        StringBuffer str1=new StringBuffer(str);
        HashSet<String> set=new HashSet<>();
        backTrak(set,str1,0);
        ArrayList<String> res=new ArrayList<>(set);
        res.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return res;
    }

    private static void backTrak(HashSet<String> res, StringBuffer str1, int i) {
        if(i==str1.length()-1){
            res.add(new String(str1));
            return;
        }
        for(int j=i;j<str1.length();j++){
            swap(str1,i,j);
            backTrak(res,str1,i+1);
            swap(str1,j,i);
        }
    }

    private static void swap(StringBuffer str1, int i, int j) {
        char tmp=str1.charAt(i);
        str1.setCharAt(i,str1.charAt(j));
        str1.setCharAt(j,tmp);
    }

    @Test
    public void test(){
        ArrayList<String> res=Permutation("abbc");
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
    }
}
