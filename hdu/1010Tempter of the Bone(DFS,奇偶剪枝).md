![借鉴思路](https://blog.csdn.net/hurmishine/article/details/51255092)

## 题目
根据地图,'S'为开始位置,'D'为门的位置,' . '为空地,'X'为墙,不能经过,  
问:在指定的时间,是否能到达'门'的位置.  
注意:路不可以重复经过,时间也要刚好是 t ,不能少.  

## 思路
:还是DFS,不能用BFS,因为BFS求的是最短路径,而此题的路径不一定最短.  
剪枝是关键,奇偶剪枝.  
奇偶剪枝原理:  
要理解奇偶剪枝,先了解一下曼哈顿距离,从一个点到达另外一个点的最短路径长度(时间)可以根据两点坐标求出,  
路径长度(非最短)与最短路径的长度同奇偶,它们的差一定是偶数!举个例子,就像两个偶数的差差是偶数,两个个数的差也是偶数.  
本题还有一个剪枝:n*m-wall与t的关系,wall为'X'的数量,解释一下,n*m为区域总数,  

```java
import java.util.Scanner;

/**
 * hdu  Tempter of the Bone
 * 奇偶剪枝dfs
 * Created by Administrator on 2018/11/12.
 */
public class Solution1010 {

    static int[][] move={{1,0},{-1,0},{0,1},{0,-1}};

    private static boolean findPath(char[][]map,int sx,int sy,int ex,int ey,int n,int m,int t){
        if(t==0){
            return map[sx][sy]=='D';
        }
        int dis=t-Math.abs(sx-ex)-Math.abs(sy-ey);
        if(dis<0||(dis&1)==1){
            return false;
        }
        char tmp=map[sx][sy];
        map[sx][sy]='X';
        for (int i=0;i<4;i++){
            int dx=sx+move[i][0],dy=sy+move[i][1];
            if(0<=dx&&dx<n&&0<=dy&&dy<m&&t>=1&&map[dx][dy]!='X'){

                if(findPath(map,dx,dy,ex,ey,n,m,t-1))
                    return true;
            }
        }
        map[sx][sy]=tmp;
        return false;
    }

    public static void main(String[] args) {
        int n,m,t,sx=0,sy=0,ex=0,ey=0,wall;
        char[][] map=new char[10][10];
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        t=in.nextInt();

        while (n!=0&&m!=0&&t!=0){
            wall=0;
            for (int i=0;i<n;i++){
                String str=in.next();
                for (int j=0;j<m;j++){
                    map[i][j]=(char)str.charAt(j);
                    if (map[i][j]=='S'){
                        sx=i;sy=j;
                    }if (map[i][j]=='D'){
                        ex=i;ey=j;
                    }else if (map[i][j]=='X'){
                        wall++;
                    }
                }
            }
            if (n*m-wall<=t||!findPath(map,sx,sy,ex,ey,n,m,t)){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
            n=in.nextInt();
            m=in.nextInt();
            t=in.nextInt();
        }
    }
}
```

![image](1.png)
