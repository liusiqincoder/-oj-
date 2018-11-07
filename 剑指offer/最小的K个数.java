package 剑指offer;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/10/14.
 */
public class 最小的K个数 {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
       /*我的解决
       ArrayList<Integer> res=new ArrayList<>();
        if(k<=0||k>input.length)
            return res;
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;*/
        if(k<=0||input==null||k>input.length)
            return new ArrayList<>();
        return quickSort(input,k);
    }

    public static ArrayList<Integer> quickSort(int[] input,int k){
        /*
        利用快速排序找出k个最小的数组，
        在k-1位置时，左边数组即为所求
        <k-1时，low指针向右移动
        >k-1时，high指针向左移动
         */
        ArrayList<Integer> res=new ArrayList<>();
        int low=0,high=input.length-1;
        int index=paration(input,low,high);
        while(index!=k-1){
            if(index<k-1){
                low=index+1;
            }else{
                high=index-1;
            }
            index=paration(input,low,high);
        }
        for(int i=0;i<k;i++)
            res.add(input[i]);
        return res;
    }

    private static int paration(int[] input, int low, int high) {
        int tmp=input[low];
        while (low<high){
            while (high>low&&input[high]>tmp)
                high--;
            input[low]=input[high];
            while (low<high&&input[low]<tmp)
                low++;
            input[high]=input[low];
        }
        input[low]=tmp;
        return low;
    }

    private static ArrayList<Integer> treeSet(int[] input,int k){
        if(input == null)
            return null;
        ArrayList<Integer> list = new ArrayList<Integer>(k);
        if(k > input.length) return list;
        TreeSet<Integer> tree = new TreeSet<Integer>();
        for(int i = 0; i < input.length; i++){
            tree.add(input[i]);
        }
        int i = 0;
        for(Integer elem : tree){
            if(i >= k)
                break;
            list.add(elem);
            i++;
        }
        return list;

    }

    private static ArrayList<Integer> heapSort(int[] input,int k){
        ArrayList<Integer> res=new ArrayList<>();

        return res;
    }

    @Test
    public void test(){
        int[] inputs={4,5,1,6,2,7,3,8};
        ArrayList<Integer> res=GetLeastNumbers_Solution(inputs,4);
        for (int i=0;i<4;i++){
            System.out.println(res.get(i));
        }
    }
}
