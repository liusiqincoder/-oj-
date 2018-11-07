package 剑指offer;

/**
 * Created by Administrator on 2018/10/31.
 */
public class 正则表达式匹配 {
    public static boolean match(char[] str, char[] pattern)
    {
//        System.out.println(str.length);
        if(str.length==0){
            if (pattern.length==0)
                return true;
            int i=0;
            while (i<pattern.length&&pattern[i]!='*'){
                i++;
                while (i < pattern.length && pattern[i] == '*') {
                        i++;
                }
            }
            return i==pattern.length&&pattern[i-1]=='*';
        }
        return dfs(0,str,0,pattern);
    }

    private static boolean dfs(int s1, char[] str, int s2, char[] pattern){
        if (s1==str.length&&s2==pattern.length){
            return true;
        }

        if(s1>=str.length||s2>=pattern.length){
            return false;
        }

        boolean ok=false;

        if(pattern[s2]=='.'){
            ok=dfs(s1+1,str,s2+1,pattern);
        }else if (pattern[s2]=='*') {
            ok=dfs(s1,str,s2+1,pattern);
        }else if(s2+1<pattern.length&&pattern[s2+1]=='*'){
            for(int i=s1;i<str.length&&str[i]==str[s1];i++){
                if(dfs(i,str,s2+2,pattern)){
                    ok=true;
                    break;
                }
            }
        }else if(str[s1]!=pattern[s2]){
            return false;
        }else {
            ok=dfs(s1+1,str,s2+1,pattern);
        }

        return ok||s1==str.length&&s2==pattern.length;
    }

    public static void main(String[] args){
        char[] str={},
                pattern={'c','*'};
        System.out.println(match(str,pattern));
    }
}
