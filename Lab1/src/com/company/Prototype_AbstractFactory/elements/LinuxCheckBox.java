package com.company.Prototype_AbstractFactory.elements;

import com.company.Prototype_AbstractFactory.Prototype;

public class LinuxCheckBox extends CheckBox {
    public LinuxCheckBox(boolean checked) {
        super(checked);
    }

    @Override
    public void paint() {
        if (isChecked()) {
            System.out.println("Print a checked Linux Checkbox");
        }
        else {
            System.out.println("Print an unchecked Linux Checkbox");
        }
    }

    @Override
    public Prototype getClone() {
        return new LinuxCheckBox(isChecked());
    }
}
