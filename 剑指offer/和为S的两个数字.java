package 剑指offer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/10/28.
 */
public class 和为S的两个数字 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res=new ArrayList<>();
        int num1=0,num2=0,mul=Integer.MAX_VALUE;
        for(int i=0;i<array.length-2;i++){
            if(find(array,i+1,sum-array[i])!=-1&&array[i]*(sum-array[i])<mul){
                mul=array[i]*(sum-array[i]);
                num1=array[i];
                num2=sum-array[i];
            }
        }
        res.add(num1);res.add(num2);
        return res;
    }
    private int find(int[] array,int low,int num){
        int high=array.length;
        while (low<high){
            int mid=(low+high)>>1;
            if(array[mid]==num)
                return mid;
            else if(array[mid]<num)
                low=mid+1;
            else
                high=mid;
        }
        return -1;
    }
}
