package list;

/**
 * @Author ZhangGJ
 * @Date 2020/12/03 07:48
 */
public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container, TestParam tp);
}
