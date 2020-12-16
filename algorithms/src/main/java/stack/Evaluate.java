package stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * ( 1 + ( ( 6 - 3 ) * ( 10 / 5 ) ) )
 *
 * @Author ZhangGJ
 * @Date 2020/12/15 07:24
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> operator = new Stack<>();
        Stack<Double> value = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("(")) {
                ;
            } else if (s.equals("+")) {
                operator.push(s);
            } else if (s.equals("-")) {
                operator.push(s);
            } else if (s.equals("*")) {
                operator.push(s);
            } else if (s.equals("/")) {
                operator.push(s);
            } else if (s.equals("sqrt")) {
                operator.push(s);
            } else if (s.equals(")")) {
                String op = operator.pop();
                double v = value.pop();
                if (op.equals("+")) {
                    v = value.pop() + v;
                } else if (op.equals("-")) {
                    v = value.pop() - v;
                } else if (op.equals("*")) {
                    v = value.pop() * v;
                } else if (op.equals("/")) {
                    v = value.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                value.push(v);
            } else {
                value.push(Double.parseDouble(s));
            }
        }
        StdOut.println(value.pop());
    }
}
