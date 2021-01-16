package sort.quick;

import edu.princeton.cs.algs4.StdRandom;
import sort.selection.SelectionSort;

import java.util.Arrays;
import java.util.Random;

import static sort.template.Example.exchange;
import static sort.template.Example.less;

/**
 * 三向切分快速排序
 *
 * @Author ZhangGJ
 * @Date 2021/01/17 06:54
 */
public class Quick3way {

    public static Comparable<?>[] sort(Comparable<?>[] arr) {
        StdRandom.shuffle(arr);
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void sort(Comparable[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = arr[lo];
        while (i <= gt) {
            int cmp = arr[i].compareTo(v);
            if (cmp < 0) {
                exchange(arr, lt++, i++);
            } else if (cmp > 0) {
                exchange(arr, i, gt--);
            } else {
                i++;
            }
        }
        sort(arr, lo, lt - 1);
        sort(arr, gt + 1, hi);
    }

    private static int partition(Comparable<?>[] arr, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable<?> v = arr[lo];
        while (true) {
            while (less(arr[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, arr[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exchange(arr, i, j);
        }
        exchange(arr, lo, j);
        return j;
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
