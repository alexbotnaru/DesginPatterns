package TemplateMethod;

public class Client {
    public static void main(String[] args) {
        Game chess = new Chess();
        chess.play();

        Game durak = new Durak();
        durak.play();
    }
}
