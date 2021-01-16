package sort.merge;

import static sort.template.Example.less;

/**
 * 归并排序（原地归并）
 * 要将一个数组排序，可以先递归地将它分成两半分别查询，然后将结果归并起来
 *
 * @Author ZhangGJ
 * @Date 2021/01/16 11:54
 */
public class Merge {

    private static Comparable<?>[] aux;

    public static Comparable<?>[] sort(Comparable<?>[] arr) {
        aux = new Comparable<?>[arr.length];
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void sort(Comparable<?>[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(Comparable<?>[] arr, int lo, int mid, int hi) {
        /*
         * 将a[lo...mid] 和 a[mid + 1 ... hi]归并
         */
        int i = lo, j = mid + 1;

        for (int k = lo; k < hi; k++) {
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
}
