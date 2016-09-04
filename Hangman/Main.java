public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("yocaminobien");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
