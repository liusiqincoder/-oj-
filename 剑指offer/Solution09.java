package 剑指offer;

/**
 * Created by Administrator on 2018/10/6.
 * 跳台阶
 */
public class Solution09 {
    public int JumpFloor(int target) {
        if(target<=0)
            return 0;
        return target==1?1:JumpFloor(target-1)+JumpFloor(target-2);
    }
}
