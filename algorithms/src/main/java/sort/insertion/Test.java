package sort.insertion;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2021/01/26 07:46
 */
public class Test {

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

	public static void main(String[] args) {
		int[] arr = new int[6];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j] = new Random().nextInt(10);
			}
			System.out.println("arr: " + Arrays.toString(arr));
			System.out.println("result: " + Arrays.toString(sort2(arr)));
			System.out.println("===================================");
		}

	}
}
