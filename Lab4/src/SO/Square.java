package SO;

public class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }
}
