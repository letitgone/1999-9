package Initialization;

/**
 * @Author ZhangGJ
 * @Date 2020/11/14 10:37
 */
public class Flower {

    int petalCount = 0;

    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        /**
         * Can’t call two!
         */
        //        this(s);

        /**
         * Another use of "this"
         */
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        /**
         * Not inside non-constructor!
         */
        //        this(11);
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
