package array;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2020/12/06 10:18
 */
public class ArrayMatrixMultiplication {

    private static int[][] a, b;

    public static void initTwoDimensionalArray() {
        a = ArrayTwoDimensional.twoDimensional(2, 3);
        b = ArrayTwoDimensional.twoDimensional(3, 4);
    }

    public static int[][] matrixMultiplication() {
        initTwoDimensionalArray();
        int aLength = a.length;
        int[][] c = new int[aLength][aLength];
        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < aLength; j++) {
                for (int k = 0; k < aLength; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixMultiplication()));
    }
}
