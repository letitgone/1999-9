package queue;

/**
 * @Author ZhangGJ
 * @Date 2020/12/16 07:05
 */
public class Queue<Item> {

    private Node first;

    private Node last;

    private int n;


    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    /**
     * 入列：链表尾部添加
     *
     * @param item
     */
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        n++;
    }

    /**
     * 出列：删除链表头
     *
     * @return
     */
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        n--;
        return item;
    }
}
