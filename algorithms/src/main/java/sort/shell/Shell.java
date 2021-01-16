package sort.shell;

import sort.selection.SelectionSort;

import java.util.Arrays;
import java.util.Random;

import static sort.template.Example.exchange;
import static sort.template.Example.less;

/**
 * 希尔排序
 * 希尔排序为了加快速度改进了插入排序
 * 希尔排序的思想是使数组中任意间隔为h的元素都是有序的。
 *
 * @Author ZhangGJ
 * @Date 2021/01/16 10:52
 */
public class Shell {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        int h = 1;
        while (h < h / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    exchange(arr, j, j - h);
                }
            }
            h = h / 3;
        }
        return arr;
    }

    public static Comparable<?>[] sort(Comparable<?>[] arr) {
        int len = arr.length;
        int h = 1;
        while (h < len / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    exchange(arr, j, j - h);
                }
            }
            h = h / 3;
        }
        return arr;
    }

    public static double[] sort(double[] arr) {
        int len = arr.length;
        int h = 1;
        while (h < len / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    exchange(arr, j, j - h);
                }
            }
            h = h / 3;
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(sort(arr)));
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
        int[] arr2 = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(sort(arr2)));
        double[] arr3 = new double[20];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = new Random().nextDouble();
        }
        System.out.println(Arrays.toString(sort(arr3)));
    }
}
