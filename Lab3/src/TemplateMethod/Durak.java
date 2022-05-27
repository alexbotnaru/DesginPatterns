package TemplateMethod;

public class Durak extends Game{
    @Override
    void initialize() {
        System.out.println("\nDurak game initialized. Press Start!");
    }

    @Override
    void start() {
        System.out.println("Durak game started!");

    }

    @Override
    void end() {
        System.out.println("Durak game ended!");
    }
}
