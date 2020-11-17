package Initialization;

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}


class Cups {
    static Cup cup1;
    static Cup cup2;



    public Cups(){
        System.out.println("23");
    }

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }


    {
        System.out.println("123");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/11/15 07:21
 */
public class ExplicitStatic {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // (1)
    }

    static Cups cups1 = new Cups(); // (2)
    static Cups cups2 = new Cups(); // (2)
}
