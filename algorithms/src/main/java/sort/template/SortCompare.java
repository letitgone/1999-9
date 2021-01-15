package sort.template;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import sort.insertion.Insertion;
import sort.selection.Selection;

/**
 * @Author ZhangGJ
 * @Date 2021/01/16 06:49
 */
public class SortCompare {

    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if ("Insertion".equals(alg)) {
            Insertion.sort(a);
        }
        if ("Selection".equals(alg)) {
            Selection.sort(a);
        }
        return timer.elapsedTime();
    }

    /**
     * Description
     *
     * @param alg 算法名称
     * @param n   数组长度
     * @param tt  重复次数
     * @return
     */
    public static double timeRandomInput(String alg, int n, int tt) {
        double total = 0.0;
        Double[] a = new Double[n];
        for (int t = 0; t < tt; t++) {
            for (int i = 0; i < n; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    /**
     * Parameter: Selection Insertion 100 1000
     *
     * @param args
     */
    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int n = Integer.parseInt(args[2]);
        int t = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, n, t);
        double t2 = timeRandomInput(alg2, n, t);
        StdOut.printf("For %d random Doubles\n     %s is", n, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2 / t1, alg2);
    }
}
