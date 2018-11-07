package 剑指offer;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2018/10/26.
 */
public class 数组中的逆序对 {
    private static int res=0;
    public static int InversePairs(int [] array) {
        merge(array,0,array.length);
        return res;
    }

    //递减
    private static void merge(int[] arr,int start,int end){
        if(start==end-1)
            return;
        int[] tmp=new int[end-start];
        int pos=0,mid=(end+start)>>1,left=start,right=mid;
        merge(arr,start,mid);
        merge(arr,mid,end);
        while (left<mid&&right<end){
            if(arr[left]>arr[right]){
                res+=end-right;
                tmp[pos++]=arr[left++];
                if(res>=1000000007){
                    res%=1000000007;
                }
            }else {
                tmp[pos++]=arr[right++];
            }
        }
        while (left<mid){
            tmp[pos++]=arr[left++];
        }
        while (right<end){
            tmp[pos++]=arr[right++];
        }
        for(int i=0;i<tmp.length;i++,start++){
            arr[start]=tmp[i];
        }
    }

    @Test
    public void test(){
        int[] arr={364,637,341,406,747,995,234,971,571,219,993,407,
                416,366,315,301,601,650,418,355,460,505,360,965,516,
                648,727,667,465,849,455,181,486,149,588,233,144,174,
                557,67,746,550,474,162,268,142,463,221,882,576,604,739,
                288,569,256,936,275,401,497,82,935,983,583,523,697,478,
                147,795,380,973,958,115,773,870,259,655,446,863,735,784,
                3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,
                848,38,811,267,575};
        System.out.println(InversePairs(arr));
    }

}
