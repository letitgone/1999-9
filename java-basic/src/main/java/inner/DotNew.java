package inner;

/**
 * @Author ZhangGJ
 * @Date 2020/11/17 08:26
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
