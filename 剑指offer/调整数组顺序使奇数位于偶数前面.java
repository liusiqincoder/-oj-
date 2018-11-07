package 剑指offer;

/**
 * Created by Administrator on 2018/10/6.
 */
public class 调整数组顺序使奇数位于偶数前面 {
    public void reOrderArray(int [] array) {
        int[] help=new int[array.length];
        int index1=0,index2=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                array[index1++]=array[i];
            }else{
                help[index2++]=array[i];
            }
        }
        index2=0;
        for(;index1<array.length;index1++){
            array[index1]=help[index2++];
        }
    }
}
