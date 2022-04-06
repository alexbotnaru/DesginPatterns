package Facade;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to draw? ");
        String answer = scanner.nextLine();
        facade.drawShape(answer);

    }
}
