package sort.template;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Author ZhangGJ
 * @Date 2020/12/17 06:56
 */
public class Example {

    public static void sort(Comparable[] a) {

    }

    public static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }

    public static boolean less(int v, int w) {
        return (v - w < 0);
    }

    public static boolean less(double v, double w) {
        return (v - w < 0);
    }

    public static void exchange(Comparable[] a, int i, int min) {
        Comparable swap = a[i];
        a[i] = a[min];
        a[min] = swap;
    }

    public static void exchange(int[] arr, int i, int min) {
        int swap = arr[i];
        arr[i] = arr[min];
        arr[min] = swap;
    }

    public static void exchange(double[] arr, int i, int min) {
        double swap = arr[i];
        arr[i] = arr[min];
        arr[min] = swap;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }

}
