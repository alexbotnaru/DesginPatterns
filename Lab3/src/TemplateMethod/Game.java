package TemplateMethod;

public abstract class Game {

    abstract void initialize();
    abstract void start();
    abstract void end();

    //template method
    public void play(){
        initialize();
        start();
        end();
    }

}
