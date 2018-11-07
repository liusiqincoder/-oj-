package 剑指offer;

/**
 * Created by Administrator on 2018/10/31.
 */
public class 数组中重复的数字 {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i=0;i<length;i++){
            if(numbers[i]==i)
                continue;
            int tmp=numbers[i];
            numbers[i]=-1;
            int pos=swap(numbers,length,duplication,tmp);
            if(pos==-2){
                return true;
            }
            numbers[i]=i;
        }
        return false;
    }

    private static int swap(int num[],int length,int[] dup,int pos){
        if(num[pos]==-1)
            return -1;
        if(num[pos]==pos){
            dup[0]=pos;
            return -2;
        }
        int tmp=num[pos];
        num[pos]=pos;
        return swap(num,length,dup,tmp);
    }
    public static  void main(String[] args){
        int []num={2,3,1,0,3,5,3};
        int[] dup=new int[1];
        System.out.println(duplicate(num,7,dup)+","+dup[0]);
    }
}
