package TemplateMethod;

public class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("\nChess game initialized. Press Start!");
    }

    @Override
    void start() {
        System.out.println("Chess game started!");

    }

    @Override
    void end() {
        System.out.println("Chess game ended");

    }
}
