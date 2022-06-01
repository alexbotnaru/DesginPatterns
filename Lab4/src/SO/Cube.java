package SO;

import SO.ThreeDimensionalShape;

import static java.lang.Math.pow;

public class Cube implements ThreeDimensionalShape {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }

    @Override
    public double calculateVolume() {
        return pow(side, 3);
    }
}
