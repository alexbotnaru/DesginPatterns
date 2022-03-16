package com.company.Builder_Singleton;

import com.company.Builder_Singleton.director.Director;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Director director = Director.getInstance();
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        System.out.println("What type of phone do you want to build? (apple/samsung/xiaomi)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("apple")){
            director.constructApplePhone(phoneBuilder);
            director.constructApplePhone(manualBuilder);
        } else if (answer.equalsIgnoreCase("samsung")){
            director.constructSamsungPhone(phoneBuilder);
            director.constructSamsungPhone(manualBuilder);
        } else if (answer.equalsIgnoreCase("xiaomi")) {
            director.constructXiaomiPhone(phoneBuilder);
            director.constructXiaomiPhone(manualBuilder);
        } else {
            System.out.println("We can't build this type of phone!");
            return;
        }

        Phone phone = phoneBuilder.getResult();
        Manual phoneManual = manualBuilder.getResult();
        System.out.println("Phone built : " + phone.getType().getBrand() +" " + phone.getType().getSeries());

        String phoneManualText = phoneManual.print();
        if (phoneManualText != null) System.out.println(phoneManualText);
    }
}
