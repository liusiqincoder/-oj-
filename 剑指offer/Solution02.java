package 剑指offer;

/**
 * Created by Administrator on 2018/10/4.
 */
public class Solution02 {
    public String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i, i + 1, "%20");
            }
        }
        return str.toString();
    }
}
