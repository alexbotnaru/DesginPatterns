package com.company.FactoryMethod;

import com.company.FactoryMethod.plans.Plan;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        PlanFactory planFactory = new PlanFactory();

        System.out.println("Introduceti tipul planului facturii (CASUAL/COMMERCIAL/INSTITUTIONAL)");

        Scanner scanner = new Scanner(System.in);
        String planName = String.valueOf(scanner.nextLine());

        System.out.println("Introduceti numarul facturilor");
        Integer units = Integer.valueOf(scanner.nextLine());

        Plan plan = planFactory.getPlan(planName);

        System.out.println("Suma facturii " + planName + " a " + units + " unitati este: ");
        plan.setRate();
        plan.calculateBill(units);


    }
}
