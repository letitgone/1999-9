package search.dictionary;

import java.util.HashMap;
import java.util.Map;

/**
 * 二分查找（基于有序数组）
 *
 * @Author ZhangGJ
 * @Date 2021/01/18 06:32
 */
public class BinarySearchST<Key extends Comparable<Key>, Value> {

	private Key[] keys;
	private Value[] values;
	private int n;

	public BinarySearchST(int capacity) {
		keys = (Key[]) new Comparable[capacity];
		values = (Value[]) new Object[capacity];
	}

	public int size() {
		return n;
	}

	public Value get(Key key) {
		if (key == null) {
			return null;
		}
		int i = rank(key);
		if (i < n && keys[i].compareTo(key) == 0) {
			return values[i];
		} else {
			return null;
		}
	}

	public int rank(Key key) {
		int lo = 0, hi = n - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			int cmp = key.compareTo(keys[mid]);
			if (cmp < 0) {
				hi = mid - 1;
			} else if (cmp > 0) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return lo;
	}
}
