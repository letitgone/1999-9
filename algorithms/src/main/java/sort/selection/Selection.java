package sort.selection;

import sort.template.Example;

import java.util.Arrays;

/**
 * 选择排序
 * <p>
 * 首先，找到数组中最小的元素，其次，将它和数组中的第一个元素交换位置（如果第一个元素就是最小的元素那么就和自己交换），
 * 再次，在剩下的元素中找到最小的元素，将它与数组中的第二个元素交换位置，如此往复。
 * <p>
 * 对于长度为N的数组，选择排序需要大约N²/2次比较和N次交换。
 * 运行时间和输入无关。
 * 数据移动是最少的。
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
        System.out.println(Arrays.toString(sort(new String[] {"er", "qw", "ab", "zg", "ue"})));
        System.out.println(Arrays.toString(
                sort(new SelectionSort[] {new SelectionSort(), new SelectionSort(),
                        new SelectionSort(), new SelectionSort(), new SelectionSort()})));
    }
}
