package com.company.Prototype_AbstractFactory.factories;

import com.company.Prototype_AbstractFactory.elements.Color;
import com.company.Prototype_AbstractFactory.elements.Button;
import com.company.Prototype_AbstractFactory.elements.CheckBox;
import com.company.Prototype_AbstractFactory.elements.WindowsButton;
import com.company.Prototype_AbstractFactory.elements.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton(String text, Color color) {
        return new WindowsButton(text, color);
    }

    @Override
    public CheckBox createCheckBox(boolean checked) {
        return new WindowsCheckBox(checked);
    }
}
