/**
 * 调和级数
 *
 * @Author ZhangGJ
 * @Date 2020/12/06 21:22
 */
public class HarmonicProgression {

    public static double harmonic(int number) {
        double sum = 0.0;
        for (int i = 0; i <= number; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(harmonic(12));
    }
}
