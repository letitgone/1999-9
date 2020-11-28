package Generic;

/**
 * @Author ZhangGJ
 * @Date 2020/11/28 08:27
 */
class Manipulator<T> {

    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    /**
     * Error: cannot find symbol: method f():
     */
    public void manipulate() {
//        obj.f();  // error！
    }
}


public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }
}
