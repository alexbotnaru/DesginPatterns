package SO;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5d);
        Square square = new Square(5d);
        Cube cube = new Cube(7.5d);

        AreaCalculator areaCalculator = new AreaCalculator();
        double circleArea =  areaCalculator.calculateArea(circle);
        double squareArea =  areaCalculator.calculateArea(square);
        double cubeArea =  areaCalculator.calculateArea(cube);

        System.out.println("Circle Area = " + circleArea);
        System.out.println("Square Area = " + squareArea);
        System.out.println("Cube Area = " + cubeArea);

        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        double circlePerimeter =  perimeterCalculator.calculatePerimeter(circle);
        double squarePerimeter =  perimeterCalculator.calculatePerimeter(square);
        double cubePerimeter =  perimeterCalculator.calculatePerimeter(cube);

        System.out.println("\nCircle Perimeter = " + circlePerimeter);
        System.out.println("Square Perimeter = " + squarePerimeter);
        System.out.println("Cube Perimeter = " + cubePerimeter);

        VolumeCalculator volumeCalculator = new VolumeCalculator();
        double cubeVolume = volumeCalculator.calculateVolume(cube);
        System.out.println("\nCube Volume = " + cubeVolume);

    }
}
