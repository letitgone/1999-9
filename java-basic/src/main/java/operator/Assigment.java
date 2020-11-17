package operator;

class Tank {
    int level;
}

/**
 * @Author ZhangGJ
 * @Date 2020/11/14 06:55
 */
public class Assigment {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        /**
         * 由于赋予的只是对象的引用，改变 t1 也就改变了 t2。 这是因为 t1 和 t2 此时指向的是堆中同一个对象。（t1
         * 原始对象的引用在 t2 赋值给其时丢失，它引用的对象会在垃圾回收时被清理）
         * 这种现象通常称为别名（aliasing）
         */
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        /**
         * 修改t1的同时也就改变了t2，这是由于t1和t2包含的是相同的引用，它们指向相同的对象
         */
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
