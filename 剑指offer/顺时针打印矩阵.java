package 剑指offer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/10/7.
 */
public class 顺时针打印矩阵 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        if(matrix.length==0||matrix[0].length==0)
            return res;
        int startX=0,endX=matrix.length-1,startY=0,endY=matrix[0].length-1;
        while (startX<=endX||startY<=endY){
            //->
            if(startX<=endX) {
                for (int i = startY; i <= endY; i++) {
                    res.add(matrix[startX][i]);
                }
            }
            startX++;
            //向下
            if(startY<=endY) {
                for (int i = startX; i <= endX; i++) {
                    res.add(matrix[i][endY]);
                }
            }
            endY--;
            //<-
            if(startX<=endX) {
                for (int i = endY; i >= startY; i--) {
                    res.add(matrix[endX][i]);
                }
            }
            endX--;
            //向上
            if(startY<=endY) {
                for (int i = endX; i >= startX; i--) {
                    res.add(matrix[i][startY]);
                }
            }
            startY++;
        }
        return res;
    }

    @Test
    public void test(){
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
//        int[][] matrix={{1},{2},{3},{4},{5}};
        ArrayList<Integer> res=printMatrix(matrix);
        for(int num:res){
            System.out.print(num+"  ");
        }
    }
}
//1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.