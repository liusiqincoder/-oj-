## 题目

![image](https://github.com/liusiqincoder/-oj-/blob/master/tiaozhanchengxusheji/picture/%E8%BF%B7%E5%AE%AB%E7%9A%84%E6%9C%80%E7%9F%AD%E8%B7%AF%E5%BE%84.png)

简单的bfs模板题，还是重复练习啊，，，，，实在不知道怎么练习合适的题目了，太难或者容易都不行

##  代码

```java
package chapter2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/11/10.
 */
public class 迷宫的最短路径 {

    public static int minPLen(char[][] graph,int sx,int sy,int ex,int ey){
        if(graph.length==0||graph[0].length==0){
            return 0;
        }
        Queue<Integer> quex=new LinkedList<>(),quey=new LinkedList<>();
        int[][] move={{1,0},{-1,0},{0,1},{0,-1}};
        boolean[][] visit=new boolean[graph.length][graph[0].length];
        for (int i=0;i<graph.length;i++)
            for (int j=0;j<graph[0].length;j++)
                visit[i][j]=false;
        visit[sx][sy]=true;
        int step=0;
        quex.add(sx);quey.add(sy);
        while (!quex.isEmpty()){
            int size=quex.size();
            step++;
            for (int k=0;k<size;k++) {
                int x=quex.poll(),y=quey.poll();
                for (int i = 0; i < 4; i++) {
                    int dx = x + move[i][0], dy = y + move[i][1];
                    if (dx == ex && dy == ey) {
                        return step;
                    }
                    if (dx >= 0 && dx < graph.length && dy >= 0 && dy < graph[0].length && !visit[dx][dy] && graph[dx][dy] != '#') {
                        visit[dx][dy] = true;
                        quex.add(dx);
                        quey.add(dy);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        char[][] graph={{'#','S','#','#','#','#','#','#','.','#'},
                {'.','.','.','.','.','.','#','.','.','#'},
                {'.','#','.','#','#','.','#','#','.','#'},
                {'.','#','.','.','.','.','.','.','.','.'},
                {'#','#','.','#','#','.','#','#','#','#'},
                {'.','.','.','.','#','.','.','.','.','#'},
                {'.','#','#','#','#','#','#','#','.','#'},
                {'.','.','.','.','#','.','.','.','.','.'},
                {'.','#','#','#','#','.','#','#','#','.'},
                {'.','.','.','.','#','.','.','.','G','#'}};

        System.out.println(minPLen(graph,0,1,9,8));
    }
}

```
