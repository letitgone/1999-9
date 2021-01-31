package sort.merge.introduction;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2021/02/01 06:53
 */
public class Merge {

    public static void merge(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[p + i - 1];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[q + j];
        }
        left[n1] = left[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = p; k < r; k++) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
        }
    }

    public static void sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(arr, p, q);
            sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr, 0, 9);
        System.out.printf(Arrays.toString(arr));
    }
}
