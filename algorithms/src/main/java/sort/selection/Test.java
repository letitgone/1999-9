package sort.selection;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2021/01/26 07:46
 */
public class Test {

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
