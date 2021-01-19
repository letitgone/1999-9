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

	public static int[] sort2(int[] arr) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				--i;
			}
			arr[i + 1] = key;
		}
		return arr;
	}

	public static int[] sort(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
				exchange(arr, j, j - 1);
			}
		}
		return arr;
	}

	public static double[] sort(double[] arr) {
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
		int[] arr = {31, 41, 59, 26, 41, 58};
		System.out.println(Arrays.toString(sort(arr)));
		System.out.println(Arrays.toString(sort2(arr)));
	}
}
