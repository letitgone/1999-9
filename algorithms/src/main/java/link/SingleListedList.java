package link;

/**
 * 单向链表
 * <p>
 * 链表是一种递归的数据结构，它或者为空（null)，或者是指向一个结点(node)的引用，该结点含有一个泛型的元素和一个指向另一条链表的引用
 *
 * @Author ZhangGJ
 * @Date 2020/12/30 07:03
 */
public class SingleListedList<E> {

    private Node<E> first;

    private Node<E> last;


    /**
     * 结点
     * LinkedList中的Node是嵌套类
     * <p>
     * 如果不需要内部类对象与其外围类对象之间的联系，那么可以将内部类声明为static，这通常称为嵌套类。
     * 普通的内部类对象隐式的保存了一个引用，指向创建它的外围类对象，然而，当内部类是static时，就不是这样了，嵌套类意味着：
     * 1）要创建嵌套类的对象，并不需要其外围类的对象；
     * 2）不能从嵌套类的对象中访问非静态的外围类对象。
     * 嵌套类与普通的内部类还有一个区别，普通内部类的字段与方法，只能放在类的外部层次上，所以普通内部类不能有static数据和static字段，也不能包含嵌套类，但是嵌套类可以包含所有这些东西。
     */
    private static class Node<E> {
        Node<E> next;
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
        Node<E> oldFirst = first;
        first = new Node<>(e);
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
        Node<E> oldLast = last;
        last = new Node<>(e);
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
        for (Node<E> x = first; x != null; x = x.next) {
            if (x.next.next == null) {
                x.next = null;
            }
        }
    }

    /**
     * 链表搜索
     *
     * @param e
     * @return
     */
    public Node<E> search(E e) {
        Node<E> node = first;
        while (node != null && node.item != e) {
            node = node.next;
        }
        return node;
    }

}
