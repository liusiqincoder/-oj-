package 剑指offer;

/**
 * Created by Administrator on 2018/10/31.
 */
public class 构建乘积数组 {
    public static int[] multiply(int[] A) {
        int[] res=new int[A.length],pre=new int[A.length+1],last=new int[A.length+1];
        pre[0]=1;
        for(int i=1,tmp=1;i<A.length;tmp*=A[i++]){
            pre[i]=tmp;
        }
        for (int i=A.length-1,tmp=1;i>=0;tmp*=A[i--]){
            last[i]=tmp;
        }
        for(int i=0;i<A.length;i++){
            res[i]=pre[i]*last[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] num={1,2,3,4,5};
        int[] res=multiply(num);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
