package operator;

class Letter {
    char c;
}

/**
 * @Author ZhangGJ
 * @Date 2020/11/14 07:03
 */
public class PassObject {

    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}
