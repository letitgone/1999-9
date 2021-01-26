package sort.selection;

import sort.template.Example;

import java.util.Arrays;
import java.util.Random;

import static sort.template.Example.exchange;
import static sort.template.Example.less;

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

    /**
     * 算法导论
     *
     * @param arr
     * @return
     */
    public static int[] sort2(int[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            int smallest = j;
            for (int i = j + 1; i < n; i++) {
                if (arr[i] < arr[smallest]) {
                    smallest = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[smallest];
            arr[smallest] = temp;
        }
        return arr;
    }

    /**
     * 存储最小值的索引
     *
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }
            exchange(arr, i, min);
        }
        return arr;
    }

    public static double[] sort(double[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }
            exchange(arr, i, min);
        }
        return arr;
    }

    public static Comparable<?>[] sort(Comparable<?>[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }
            exchange(arr, i, min);
        }
        return arr;
    }

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
