/**
 * 牛顿迭代法求平方根
 *
 * @Author ZhangGJ
 * @Date 2020/12/06 21:01
 */
public class SquareRoot {

    public static double sqrt(double number) {
        if (number < 0) {
            return Double.NaN;
        }
        double err = 1e-15;
        double t = number;
        while (Math.abs(t - number / t) > err * t) {
            t = (number / t + t) / 2.0;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(15));
        System.out.println(1e-15);
    }
}
