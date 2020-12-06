package array;

import java.util.Arrays;
import java.util.Random;

/**
 * 二维数组
 *
 * @Author ZhangGJ
 * @Date 2020/12/06 10:02
 */
public class ArrayTwoDimensional {

    public static int[][] twoDimensional(int row, int column) {
        int[][] a = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Random random = new Random();
                a[i][j] = random.nextInt(9);
                System.out.print(a[i][j]);
                if (j == column - 1) {
                    System.out.println();
                } else {
                    System.out.print(", ");
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(twoDimensional(3, 4)));
    }
}
