package sort;

import sort.template.Example;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * @Author ZhangGJ
 * @Date 2020/12/18 06:29
 */
public class Shell {

    public static Comparable[] sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && Example.less(a[j], a[j - h]); j -= h) {
                    Example.exchange(a, j, j - h);
                }
            }
            h = h / 3;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[] {2, 6, 1, 8, 9})));
    }
}
