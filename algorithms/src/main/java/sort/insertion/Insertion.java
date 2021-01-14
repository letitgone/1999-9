package sort.insertion;

import sort.selection.SelectionSort;

import java.util.Arrays;
import java.util.Random;

import static sort.template.Example.exchange;
import static sort.template.Example.less;

/**
 * 插入排序
 * <p>
 * 为了给要插入的元素腾出空间，我们需要将其余所有元素在插入之前都向右移动一位，这种算法叫插入排序。
 * <p>
 * 插入排序所需的时间取决于输入中元素的初始顺序，插入排序对于实际应用中常见的某些类型的非随机数组很有效。
 *
 * @Author ZhangGJ
 * @Date 2021/01/15 06:49
 */
public class Insertion {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
                exchange(arr, j, j - 1);
            }
        }
        return arr;
    }

    public static Comparable<?>[] sort(Comparable<?>[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
                exchange(arr, j, j - 1);
            }
        }
        return arr;
    }

//    // put smallest element in position to serve as sentinel
//    int exchanges = 0;
//        for (int i = n-1; i > 0; i--) {
//        if (less(a[i], a[i-1])) {
//            exch(a, i, i-1);
//            exchanges++;
//        }
//    }
//        if (exchanges == 0) return;
//
//
//    // insertion sort with half-exchanges
//        for (int i = 2; i < n; i++) {
//        Comparable v = a[i];
//        int j = i;
//        while (less(v, a[j-1])) {
//            a[j] = a[j-1];
//            j--;
//        }
//        a[j] = v;
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[] {2, 6, 1, 8, 9})));
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
        int[] arr = {2, 6, 1, 8, 9};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
