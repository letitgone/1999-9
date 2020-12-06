package array;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2020/12/06 09:59
 */
public class ArrayReverseOrder {

    private static int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    /**
     * 颠倒数组元素的顺序
     *
     * @param original
     * @return
     */
    public static String reverseOrder(int[] original) {
        for (int i = 0; i < arr.length / 2; i++) {
            int data = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = data;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseOrder(arr));
    }
}
