package polymorphism;

class Useful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful {
    @Override
    public void f() {
    }

    public void g() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }
}

/**
 * @Author ZhangGJ
 * @Date 2020/11/16 08:28
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
        // Compile time: method not found in Useful:
//        x[1].u();
        /**
         * Downcast/RTTI
         */
        ((MoreUseful) x[1]).u();
        /**
         * Exception thrown
         */
        ((MoreUseful) x[0]).u();
    }
}
