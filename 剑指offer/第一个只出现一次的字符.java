package 剑指offer;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/26.
 */
public class 第一个只出现一次的字符 {
    public static int FirstNotRepeatingChar(String str) {
        int[] nums=new int[256],index=new int[256];
        Arrays.fill(nums,0);
        Arrays.fill(index,-1);
        for(int i=0;i<str.length();i++){
            int pos=str.charAt(i);
            if(nums[pos]<2){
                nums[pos]++;
                index[pos]=i;
            }
        }
        int res=str.length()+1;
        for(int i='a';i<='z';i++){
            if(nums[i]==1&&index[i]<res){
                res=index[i];
            }
        }
        for(int i='A';i<='Z';i++){
            if(nums[i]==1&&index[i]<res){
                res=index[i];
            }
        }
        return res==str.length()+1?-1:res;
    }

    @Test
    public void test(){
        String str="kYVmIJVzYWPQLtIdKMmvkVSoKtqJANOfCCOfLVJEjjhbnPrDOwKCDeqhts";
        System.out.println(FirstNotRepeatingChar(str));
    }
}
