package exception;

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important exception!";
    }
}


class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial exception";
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/11/26 07:10
 */
public class LostMessage {
    public void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    public void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
