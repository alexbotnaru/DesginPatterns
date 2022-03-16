package com.company.FactoryMethod.plans;

public abstract class Plan {
    protected double rate;

    public abstract void setRate();

    public void calculateBill(int units){
        System.out.println(units * rate);
    }
}
