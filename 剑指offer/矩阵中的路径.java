package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/11/7.
 */
public class 矩阵中的路径 {

    private static int col=0,row=0;

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(str==null||str.length==0){
            return true;
        }
        if(matrix==null||matrix.length<str.length){
            return false;
        }
        if (matrix.length==1&&str.length==1){
            return matrix[0]==str[0];
        }
        col=cols;row=rows;
        boolean[] visit=new boolean[row*col];
        Arrays.fill(visit,false);
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (dfs(matrix,visit,i,j,0,str)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[] matrix,boolean[] visit,int x,int y,int pos,char[] str){
        if(pos==str.length){
            return true;
        }
        if(matrix[x*col+y]!=str[pos])
            return false;
        int[][] move={{1,0},{-1,0},{0,1},{0,-1}};
        for (int i=0;i<4;i++){
            int dx=x+move[i][0],dy=y+move[i][1];
            boolean ok=true;
            if(0<=dx&&dx<row&&0<=dy&&dy<col&&!visit[dx*col+dy]){
                visit[dx*col+dy]=true;
                ok=dfs(matrix,visit,dx,dy,pos+1,str);
                visit[dx*col+dy]=false;
            }
            if (ok){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        char[] matrix={'A'};
        char[] str={'A'};
        System.out.println(hasPath(matrix,1,1,str));
    }
}
