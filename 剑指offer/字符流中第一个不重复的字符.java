package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;
public class 字符流中第一个不重复的字符 {
    Queue<Character> que=new LinkedList<>();
    int[]  set=new int[256];
    char res='#';
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(set[ch]==0){
            que.add(ch);
        }else if(ch==res){
            res='#';
        }
        set[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if(res=='#'||set[res]>1) {
            while (!que.isEmpty()) {
                char ch = que.poll();
                if (set[ch] == 1) {
                    res=ch;
                    break;
                }
            }
        }
        return res;
    }
}