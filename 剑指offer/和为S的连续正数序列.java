package 剑指offer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/10/28.
 */
public class 和为S的连续正数序列 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int all=0,low=1;
        for(int i=1,num=sum/2+2;i<num;i++){
            all+=i;
            if(all>=sum){
                while (all>sum)
                    all-=low++;
                if(all==sum&&low!=i-1){
                    ArrayList<Integer> help=new ArrayList<>();
                    int start=low;
                    while(start<=i){
                        help.add(start++);
                    }
                    res.add(help);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){

    }
}
