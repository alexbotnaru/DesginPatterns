package com.company.Prototype_AbstractFactory.elements;

import com.company.Prototype_AbstractFactory.Prototype;

public class WindowsButton extends Button {

    public WindowsButton(String text, Color color) {
        super(text, color);
    }

    @Override
    public void paint() {
        System.out.println("Print a Windows Button with the text: " + getText() + " and the color: " + getColor());
    }

    @Override
    public Prototype getClone() {
        return new WindowsButton(getText(), getColor());
    }
}
