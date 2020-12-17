package sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @Author ZhangGJ
 * @Date 2020/12/17 06:40
 */
public class Selection {

    public static Comparable[] sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (Example.less(a[j], a[min])) {
                    min = j;
                }
            }
            Example.exchange(a, i, min);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[] {2, 6, 1, 8, 9})));
    }
}
