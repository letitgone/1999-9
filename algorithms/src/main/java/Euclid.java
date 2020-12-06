/**
 * @Author ZhangGJ
 * @Date 2020/12/06 09:18
 */
public class Euclid {

    public static int euc(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return euc(q, r);
    }

    public static void main(String[] args) {
        System.out.println(euc(9, 4));
    }
}
