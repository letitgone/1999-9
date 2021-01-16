package sort.merge;

import sort.selection.SelectionSort;

import java.util.Arrays;
import java.util.Random;

import static sort.template.Example.less;

/**
 * 自底向上的归并排序
 *
 * @Author ZhangGJ
 * @Date 2021/01/17 06:24
 */
public class MergeBU {

    private static Comparable<?>[] aux;

    public static Comparable<?>[] sort(Comparable<?>[] arr) {
        int len = arr.length;
        aux = new Comparable<?>[len];
        for (int sz = 1; sz < len; sz = sz + sz) {
            for (int lo = 0; lo < len - sz; lo += sz + sz) {
                merge(arr, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, len - 1));
            }
        }
        return arr;
    }

    private static void merge(Comparable<?>[] arr, int lo, int mid, int hi) {
        /*
         * 将a[lo...mid] 和 a[mid + 1 ... hi]归并
         */
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = arr[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > hi) {
                arr[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                arr[k] = aux[j++];
            } else {
                arr[k] = aux[i++];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[] {6, 5, 9, 3, 1, 7})));
        System.out.println(Arrays.toString(sort(new String[] {"er", "qw", "ab", "zg", "ue"})));
        SelectionSort[] selectionSorts =
                new SelectionSort[] {new SelectionSort(), new SelectionSort(), new SelectionSort(),
                        new SelectionSort(), new SelectionSort()};
        for (int i = 0; i < selectionSorts.length; i++) {
            SelectionSort selectionSort = selectionSorts[i];
            Random random = new Random();
            selectionSort.setId(random.nextInt(100));
            selectionSort.setName("Test" + i);
        }
        System.out.println(Arrays.toString(sort(selectionSorts)));
    }
}
