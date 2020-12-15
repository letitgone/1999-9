package search;

import edu.princeton.cs.algs4.Bag;

import java.util.Queue;
import java.util.Stack;

/**
 * @Author ZhangGJ
 * @Date 2020/12/08 07:03
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.valueOf(args[i]);
        }
        rank(33, a);
    }
}
