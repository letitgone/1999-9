package generic;

/**
 * @Author ZhangGJ
 * @Date 2020/11/28 08:36
 */
public class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}
