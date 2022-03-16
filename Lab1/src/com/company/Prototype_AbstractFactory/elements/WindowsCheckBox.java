package com.company.Prototype_AbstractFactory.elements;

import com.company.Prototype_AbstractFactory.Prototype;

public class WindowsCheckBox extends CheckBox {
    public WindowsCheckBox(boolean checked) {
        super(checked);
    }

    @Override
    public void paint() {
        if (isChecked()) {
            System.out.println("Prints a checked Windows Checkbox");
        }
        else {
            System.out.println("Print an unchecked Windows Checkbox");
        }
    }

    @Override
    public Prototype getClone() {
        return new WindowsCheckBox(isChecked());
    }
}
