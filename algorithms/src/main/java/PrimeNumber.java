/**
 * 素数
 *
 * @Author ZhangGJ
 * @Date 2020/12/06 11:36
 */
public class PrimeNumber {

    public static boolean isPrimeNumber(int number) {
        boolean result = true;
        if (number < 2) {
            result = false;
        }
        for (int i = 2; i < number + 1; i++) {
            if (number == i) {
                break;
            }
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 2; i < 101; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
