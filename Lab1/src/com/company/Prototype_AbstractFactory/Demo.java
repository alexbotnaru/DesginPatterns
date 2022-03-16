package com.company.Prototype_AbstractFactory;

import com.company.Prototype_AbstractFactory.elements.Button;
import com.company.Prototype_AbstractFactory.elements.CheckBox;
import com.company.Prototype_AbstractFactory.elements.Color;
import com.company.Prototype_AbstractFactory.factories.GUIFactory;
import com.company.Prototype_AbstractFactory.factories.LinuxFactory;
import com.company.Prototype_AbstractFactory.factories.WindowsFactory;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Application app = null;
        GUIFactory factory;

        Scanner scanner = new Scanner(System.in);
        String answer;

        System.out.println("What type is your operating system? ");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("windows")) {
            factory = new WindowsFactory();
            app = new Application(factory);
        } else if (answer.equalsIgnoreCase("linux")){
            factory = new LinuxFactory();
            app = new Application(factory);
        } else {
            System.out.println("Unsupported operating system! ");
            return;
        }

        System.out.println("Please enter the text of the button: ");
        String buttonText = scanner.nextLine();
        System.out.println("Please select the color of the button (BLACK, YELLOW, RED, BLUE, GREEN)");
        String buttonColor = scanner.nextLine().toUpperCase(Locale.ROOT);

        System.out.println("Do you want the checkbox to be checked? (y/n)");
        String check = scanner.nextLine();
        boolean isChecked = check.contains("y");

        Button button = app.paintButton(buttonText, Color.valueOf(buttonColor));
        CheckBox checkBox = app.paintCheckBox(isChecked);

        Button clonedButton = (Button) button.getClone();
        CheckBox clonedCheckBox = (CheckBox) checkBox.getClone();

        System.out.println("----- Prototype demo -----");
        System.out.println("\nCloned Button\ntext: " + clonedButton.getText() + "\ncolor: " + clonedButton.getColor());
        System.out.println("\nCloned Checkbox\nchecked: " + clonedCheckBox.isChecked());
        
        System.out.println("\nbutton is equal to clonedButton by value = " + button.equals(clonedButton));

        clonedButton.setColor(Color.BLACK);
        System.out.println("clonedButton color: " + clonedButton.getColor());
        System.out.println("button color: " + button.getColor());




    }
}
