package Initialization;

class Banana {

    void peel(int i) { }

}

/**
 * @Author ZhangGJ
 * @Date 2020/11/14 08:42
 */
public class BananaPeel {

    public static void main(String[] args) {
        Banana a = new Banana(),
               b = new Banana();
        a.peel(1);
        b.peel(2);
    }

}
