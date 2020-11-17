package Initialization;

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    /**
     * Before constructor
     */
    Window w1 = new Window(1);

    House() {
        // Show that we’re in the constructor:
        System.out.println("House()");
        /**
         * // Reinitialize w3
         */
        w3 = new Window(33);
    }

    /**
     * After constructor
     */
    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    /**
     * At end
     */
    Window w3 = new Window(3);
}

/**
 * @Author ZhangGJ
 * @Date 2020/11/15 06:54
 */
public class OrderOfInitialization {

    public static void main(String[] args) {
        House h = new House();
        h.f(); // Shows that construction is done
    }
}
