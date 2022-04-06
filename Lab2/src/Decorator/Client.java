package Decorator;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new ShapeDecorator(new Circle()));

        Shape redRectangle = new RedShapeDecorator(new ShapeDecorator(new Rectangle()));

        System.out.println("Circle with normal border");

        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }
}
