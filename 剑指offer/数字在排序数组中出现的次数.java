package 剑指offer;

/**
 * Created by Administrator on 2018/10/28.
 */
public class 数字在排序数组中出现的次数 {
    public static int GetNumberOfK(int [] array , int k) {
        int num=0;
        int pos=find(array,k);
        if(pos==-1)
            return 0;
        for(int i=pos;i<array.length&&array[i]==k;i++)
            num++;
        return num;
    }

    private static int find(int[] array, int k) {
        int low=0,high=array.length;
        while (low<high){
            int mid=(low+high)>>1;
            if(array[mid]>=k)
                high=mid;
            else
                low=mid+1;
        }
        if(low==array.length)
            return -1;
        return array[low]==k?low:-1;
    }

    public static void main(String[] args){
        int[] array={1,2,2,3,3,3,3,3,4,5,6,7,8};
        int k=3;
        System.out.println(find(array,k));
    }
}
