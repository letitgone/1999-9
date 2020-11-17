package reusing;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}


class BoardGame extends Game {
    public BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/11/15 09:01
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
