package Facade;

import java.util.Locale;

public class Facade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public Facade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawShape(String shape) {
        switch (shape.toLowerCase(Locale.ROOT)) {
            case "circle":
                circle.draw();
                break;
            case "rectangle":
                rectangle.draw();
                break;
            case "square":
                square.draw();
                break;
            default:
                System.out.println("Invalid shape");
        }
    }

}
