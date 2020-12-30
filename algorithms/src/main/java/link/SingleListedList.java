package link;

/**
 * 单向链表
 *
 * @Author ZhangGJ
 * @Date 2020/12/30 07:03
 */
public class SingleListedList<E> {

    private Node first;

    private Node last;


    /**
     * 结点
     */
    private static class Node<E> {
        Node next;
        E item;

        public Node(E item) {
            this.item = item;
        }
    }

    /**
     * 表头插入结点 (所需时间和链表长度无关)
     *
     * @param e
     */
    public void addFirst(E e) {
        Node oldFirst = first;
        Node<E> node = new Node<>(e);
        first = node;
        first.next = oldFirst;
        first.item = e;
    }

    /**
     * 表头删除结点 (所需时间和链表长度无关)
     *
     * @param e
     */
    public void deleteFirst(E e) {
        first = first.next;
    }

    /**
     * 表尾插入结点 (所需时间和链表长度无关)
     *
     * @param e
     */
    public void addLast(E e) {
        Node oldLast = last;
        Node<E> node = new Node<>(e);
        last = node;
        last.item = e;
        oldLast.next = last;
    }

    /**
     * 删除最后一个结点，需要把最后一个结点的前一个结点next赋值为null，
     * 由于缺少信息，因此需要遍历所有链表（所需时间跟链表长度成正比，显然并不是理想的方式）
     * 解决办法可以使用双向链表
     *
     * @param e
     */
    public void deleteLast(E e) {
        for (Node x = first; x != null; x = x.next) {
            if (x.next.next == null) {
                x.next = null;
            }
        }
    }

}
