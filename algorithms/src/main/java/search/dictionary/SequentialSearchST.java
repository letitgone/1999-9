package search.dictionary;

/**
 * 顺序查找（基于无序链表）
 *
 * @Author ZhangGJ
 * @Date 2021/01/18 06:15
 */
public class SequentialSearchST<key, Value> {

	private Node first;


	private class Node {
		key key;
		Value value;
		Node next;

		public Node(key key, Value value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public Value get(key key) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				return x.value;
			}
		}
		return null;
	}

	public void put(key key, Value value) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				x.value = value;
				return;
			}
		}
		first = new Node(key, value, first);
	}
}
