package Initialization;

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    static {
        System.out.println("123");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/11/15 07:31
 */
public class Mugs {


    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        Mug m = new Mug(1);
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}
