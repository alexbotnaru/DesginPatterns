package com.company.Prototype_AbstractFactory.elements;

import com.company.Prototype_AbstractFactory.Prototype;

public class LinuxButton extends Button {
    public LinuxButton(String text, Color color) {
        super(text, color);
    }

    @Override
    public void paint() {
        System.out.println("Print a Linux Button with the text: " + getText() + " and the color: " + getColor());
    }

    @Override
    public Prototype getClone() {
        return new LinuxButton(getText(), getColor());
    }
}
