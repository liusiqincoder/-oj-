package 剑指offer;

/**
 * Created by Administrator on 2018/10/7.
 */
public class 二叉树的后序遍历序列 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        return isBST(0,sequence.length-1,sequence);
    }

    private boolean isBST(int start, int end, int[] sequence) {
        if(start>=end)
            return true;
        int mid=start;
        for(;mid<end;mid++){
            if(sequence[mid]>sequence[end]){
                break;
            }
        }
        for(int i=mid;i<end;i++){
            if(sequence[i]<sequence[end]){
                return false;
            }
        }

        return isBST(start,mid-1,sequence)&&isBST(mid,end-1,sequence);
    }
}
