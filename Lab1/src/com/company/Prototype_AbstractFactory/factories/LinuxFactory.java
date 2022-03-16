package com.company.Prototype_AbstractFactory.factories;

import com.company.Prototype_AbstractFactory.elements.Color;
import com.company.Prototype_AbstractFactory.elements.Button;
import com.company.Prototype_AbstractFactory.elements.CheckBox;
import com.company.Prototype_AbstractFactory.elements.LinuxButton;
import com.company.Prototype_AbstractFactory.elements.LinuxCheckBox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton(String text, Color color) {
        return new LinuxButton(text, color);
    }

    @Override
    public CheckBox createCheckBox(boolean checked) {
        return new LinuxCheckBox(checked);
    }
}
