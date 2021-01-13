package sort;

import sort.template.Example;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @Author ZhangGJ
 * @Date 2020/12/17 07:37
 */
public class Insertion {

    public static Comparable[] sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--) {
                Example.exchange(a, j, j - 1);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[] {2, 6, 1, 8, 9})));
    }
}
