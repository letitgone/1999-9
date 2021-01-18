package queue;

import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Transaction;
import stack.Stack;

/**
 * 优先队列
 *
 * @Author ZhangGJ
 * @Date 2021/01/17 10:48
 */
public class TopM {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		MinPQ<Transaction> pq = new MinPQ<>(m + 1);
		while (StdIn.hasNextLine()) {
			pq.insert(new Transaction(StdIn.readLine()));
			if (pq.size() > m) {
				pq.delMin();
			}
			Stack<Transaction> stack = new Stack<>();
			while (!pq.isEmpty()) {
				stack.push(pq.delMin());
			}
			for (Transaction t : stack) {
				StdOut.println(t);
			}
		}
	}
}
