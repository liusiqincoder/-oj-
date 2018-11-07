package 剑指offer;

/**
 * Created by Administrator on 2018/10/4.
 */
public class Solution06 {
    public static int minNumberInRotateArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right - 1) {
            int mid = (left + right) >> 1;
            if (array[mid] < array[left])
                right = mid;
            else
                left = mid;
        }
        int res = array[left] < array[right] ? left : right;
        return array.length == 0 ? 0 : array[res];
    }

    public static void main(String[] args) {
        /*int[] array={6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,
                9359,9719,9895,9896,9913,9962,154,293,334,492,1323
                ,1479,1539,1727,1870,1943,2383,
                2392,2996,3282,3812,3903,4465,4605,4665,
                4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};*/
        int[] array = {6, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5};
        System.out.println(minNumberInRotateArray(array));
    }
}
